package nose.com.alfa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import nose.com.alfa.models.CalifMat;
import nose.com.alfa.models.Calificaciones;

@Repository
public class CalificacionJDBC {

    @Autowired
    JdbcTemplate conexion;
    
    //busca por el id del alumno
//el nombre de la materia y califacion
    public List<CalifMat> consultarCaf(int id) {
        String sql="SELECT m.nombre,c.alumno_id,c.calificacion FROM calificaciones AS c JOIN materias AS m ON c.materia_id = m.id WHERE alumno_id=?;";
        return conexion.query(sql,new CalifMatRM(),id);
    }

    public List<Calificaciones> consultar() {
        String sql="SELECT * FROM calificaciones;";
        return  conexion.query(sql,new CalificacionRM());
    }
    
}
