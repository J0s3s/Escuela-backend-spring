package nose.com.alfa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import nose.com.alfa.models.Materias;

public class MateriasRM implements RowMapper<Materias>{

    @Override
    @Nullable
    public Materias mapRow(ResultSet rs, int rowNum) throws SQLException {
        // TODO Auto-generated method stub
        Materias materias= new Materias();
        materias.setId(rs.getByte("id"));
        materias.setNombre(rs.getString("nombre"));
        materias.setClave(rs.getString("clave"));
        materias.setCreditos(rs.getByte("creditos"));
        return materias;
    }


    
}
