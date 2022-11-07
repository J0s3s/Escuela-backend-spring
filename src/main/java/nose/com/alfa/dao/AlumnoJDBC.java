package nose.com.alfa.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import nose.com.alfa.models.Alumnos;

@Repository
public class AlumnoJDBC {

    @Autowired
    JdbcTemplate conexion;

    public List<Alumnos> consultarAlumnos() {
        String sql="SELECT * FROM alumnos WHERE activo=1;";
        return  conexion.query(sql,new AlumnoRM());
    }

    public Alumnos buscar(int id) {
        String sql="SELECT * FROM alumnos WHERE id=? AND activo=1;";
        return  conexion.queryForObject(sql,new AlumnoRM(),id);
    }

    public void desactivar(int id) {
        String sql="UPDATE alumnos SET activo = 0, deleted = NOW() WHERE id=?;";
        conexion.update(sql,id);
    }

    public void actualizar(Alumnos alumno) {
        String sql="UPDATE alumnos SET nombre=?,nocontrol=?, updated=NOW() WHERE id=?;";
        conexion.update(sql,alumno.getNombre(),alumno.getNocontrol(),alumno.getId());
    }
}
