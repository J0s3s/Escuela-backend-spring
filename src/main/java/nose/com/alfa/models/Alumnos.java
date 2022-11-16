package nose.com.alfa.models;

public class Alumnos {
    private byte id;
    private String nombre;
    private String nocontrol;
    private byte activo;
    private String deleted;
    
    public byte getActivo() {
        return activo;
    }
    public void setActivo(byte activo) {
        this.activo = activo;
    }
    public String getDeleted() {
        return deleted;
    }
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
    public byte getId() {
        return id;
    }
    public void setId(byte id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNocontrol() {
        return nocontrol;
    }
    public void setNocontrol(String nocontrol) {
        this.nocontrol = nocontrol;
    }
    public void setId(String string) {
    }
}
