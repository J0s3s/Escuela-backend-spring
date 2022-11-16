package nose.com.alfa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import nose.com.alfa.models.Calificaciones;

public class CalificacionRM implements RowMapper<Calificaciones>{

    @Override
    @Nullable
    public Calificaciones mapRow(ResultSet rs, int rowNum) throws SQLException {
        Calificaciones calificacion= new Calificaciones();
        calificacion.setId(rs.getByte("id"));
        calificacion.setAlumno_id(rs.getByte("alumno_id"));
        calificacion.setMateria_id(rs.getByte("materia_id"));
        calificacion.setCalificacion(rs.getByte("calificacion"));
        return calificacion;
    }
    
    
}
