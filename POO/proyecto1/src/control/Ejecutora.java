package control;
import modelo.Curso;
import modelo.Persona;
public class Ejecutora {
    public static void main(String[] args) {
        Curso poo = new Curso();
        poo.adicionarProfesor(new Persona ("Diego","Vistoso",199654691));
        poo.adicionarProfesor(new Persona ("Juan","Valdes",145657691));
        
        poo.adicionarEstudiante(new Persona ("Matias","Vergara",199654691));
        poo.adicionarEstudiante(new Persona ("Pedro","Barrera",145657691));
        poo.adicionarEstudiante(new Persona ("Ignacio","Gutierrez",199654691));
        poo.adicionarEstudiante(new Persona ("Octavio","Veloz",145657691));
        
        poo.imprimirListadoEstudiantes();
        poo.imprimirListadoProfesores();
    }
}
