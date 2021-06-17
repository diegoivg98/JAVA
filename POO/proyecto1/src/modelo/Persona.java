package modelo;
public class Persona {
    private String nombre;
    private String apellido;
    private long rut;
    
    public Persona(String nombre,String apellido, long rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setRut(long rut) {
        this.rut = rut;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
     public long getRut() {
        return rut;
    }
}
