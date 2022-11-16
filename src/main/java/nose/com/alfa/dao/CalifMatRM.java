package nose.com.alfa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import nose.com.alfa.models.CalifMat;

public class CalifMatRM implements RowMapper<CalifMat>{

    @Override
    @Nullable
    public CalifMat mapRow(ResultSet rs, int rowNum) throws SQLException {
        // TODO Auto-generated method stub
        CalifMat cali =new CalifMat();
        cali.setNombre(rs.getString("nombre"));
        cali.setAlumno_id(rs.getByte("alumno_id"));
        cali.setCalifacion(rs.getByte("calificacion"));
        return cali;
    }

    
}
