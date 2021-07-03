package control;
import modelo.*;
public class Ejecutora {
    public static void main(String[] args) {
        //Persona p1 = new Persona("nombre", "Apellido", "email", 12345678);
        Persona e1 = new Estudiante("nombreEstudiante", "apellidoEstudiante", "emailEstudiante", 987654321, "nomInstitucion");
        Academico p1 = new Academico("NombreAcademico", "ApellidoAcademico", "emailAcademico", 123456789, "nomDepartamento");
        System.out.println("Estudiante  "+e1.getDetalle()+" estudia en "+((Estudiante)e1).getInstitucion());
        System.out.println("Academico "+ p1.getNombre()+" trabaja en el departamento "+p1.getDepartamento());
    }
}