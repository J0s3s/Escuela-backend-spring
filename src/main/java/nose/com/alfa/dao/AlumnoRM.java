package nose.com.alfa.dao;



import nose.com.alfa.models.Alumnos;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

public class AlumnoRM implements RowMapper<Alumnos> {

    @Override
    @Nullable
    public Alumnos mapRow(ResultSet rs, int rowNum) throws SQLException {
        // TODO Auto-generated method stub
        Alumnos alumno=new Alumnos();
        alumno.setId(rs.getByte("id"));
        alumno.setNombre(rs.getString("nombre"));
        alumno.setNocontrol(rs.getString("nocontrol"));
        return alumno;
    }
    
}