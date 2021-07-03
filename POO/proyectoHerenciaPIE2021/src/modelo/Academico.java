package modelo;
public class Academico extends Persona{
    private String departamento;
    public Academico(String nombre, String apellido, String email, long numTelefono, String departamento){
        super(nombre, apellido, email, numTelefono);
        this.setDepartamento(departamento);
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }   
}