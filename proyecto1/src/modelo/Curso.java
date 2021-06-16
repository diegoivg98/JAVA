package modelo;
import java.util.List;
import java.util.ArrayList;
public class Curso {
    private List <Persona> profesores;
    private List <Persona> estudiantes;
    public Curso() {
        this.crearCurso();
    }
    public void adicionarEstudiante(Persona p){
        this.estudiantes.add(p);
    }
    public void adicionarProfesor(Persona p){
         this.profesores.add(p);
    }
    public void imprimirListadoProfesores(){
        this.profesores.forEach((p) -> {
            System.out.println("["+p.getNombre()+ " " +p.getApellido()+ " " +p.getRut()+"]");
        });
        System.out.println("");   
    }    
    public void imprimirListadoEstudiantes(){
        this.estudiantes.forEach((p) -> { 
            System.out.println("["+p.getNombre()+ " " +p.getApellido()+ " " +p.getRut()+"]");
        });
        System.out.println("");   
        }
        
     private void crearCurso() {
        this.profesores = new ArrayList();
        this.estudiantes = new ArrayList();
    }
}
