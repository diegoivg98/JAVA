package modelo;
public class Persona implements Detalles{
    private String nombre;
    private String apellido;
    private String email;
    private Long numTelefono;
    private String detalle;
    public Persona(String nombre, String apellido, String email, Long numTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numTelefono = numTelefono;
        
        this.setDetalle(nombre, numTelefono);
    }
    public String getNombre() {
        return nombre;
    }
    protected String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }
    public long getNumTelefono() {
        return numTelefono;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setApellido(String apellido) {
        this.apellido = apellido;
    }
    private void setEmail(String email) {
        this.email = email;
    }
    private void setNumTelefono(long numTelefono) {
        this.numTelefono = numTelefono;
    }
    public void setDetalle(String nombre, Long numTelefono) {
        this.detalle = nombre +"  " +numTelefono.toString();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getDetalle() {
        return this.detalle;
    }   
}