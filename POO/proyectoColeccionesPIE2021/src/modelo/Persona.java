package modelo;


public class Persona {

    private long rut;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public long getRut() {
        return rut;
    }

    private void setRut(long rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona(long rut, String nombre, String apellido, String email, String direccion) {
        this.setRut(rut);
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setEmail(email);
    }
    
    
    
}
