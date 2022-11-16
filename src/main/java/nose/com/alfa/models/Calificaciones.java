package nose.com.alfa.models;

public class Calificaciones {
    private byte id;
    private byte alumno_id;
    private byte materia_id;
    private byte calificacion;
    public byte getId() {
        return id;
    }
    public void setId(byte id) {
        this.id = id;
    }
    public byte getAlumno_id() {
        return alumno_id;
    }
    public void setAlumno_id(byte alumno_id) {
        this.alumno_id = alumno_id;
    }
    public byte getMateria_id() {
        return materia_id;
    }
    public void setMateria_id(byte materia_id) {
        this.materia_id = materia_id;
    }
    public byte getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(byte calificacion) {
        this.calificacion = calificacion;
    } 
}
