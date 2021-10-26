package modelo;
public class Persona {
    private Integer rut;
    private String nombre;
    private String apellido;
    private String direccion;
    public Persona(Integer rut, String nombre, String apellido, String direccion) {
        this.setRut(rut);
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setDireccion(direccion);
    }
    private void setRut(Integer rut) {
        this.rut = rut;
    }
    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public Persona setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }
    public Persona setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
    public Integer getRut() {
        return rut;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }    

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }
    
}
