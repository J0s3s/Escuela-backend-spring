package nose.com.alfa.models;

public class Materias {
    private byte id;
    private String nombre;
    private String clave;
    private byte creditos;
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
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public byte getCreditos() {
        return creditos;
    }
    public void setCreditos(byte creditos) {
        this.creditos = creditos;
    }
    
}
