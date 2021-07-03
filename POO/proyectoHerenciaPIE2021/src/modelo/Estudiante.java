package modelo;
public class Estudiante extends Persona{
    private String institucion;
    private String [] cursos;
    public Estudiante(String nombre, String apellido, String email, long numTelefono, String institucion){
        super(nombre, apellido, email, numTelefono);
        this.setInstitucion(institucion);
        this.cursos = new String[10];        
    }
    public String getInstitucion() {
        return institucion;
    }
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    public String[] getCursos() {
        return cursos;
    }
    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }    
    public String getNombre(){
        return super.getNombre();
    }    
    public String getApellido(){
        return super.getApellido();
    }    
}