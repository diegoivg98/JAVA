package ejemploherencia;
public class Ejemploherencia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.edad = 23;
        cliente.nombre = "Diego";
        cliente.telefono = 344657679;
        cliente.credito = 376.67;
        System.out.println("Me llamo "+cliente.nombre+", tengo "+cliente.edad+" años, mi telefono es "+cliente.telefono+
                " y tengo un credito total de "+cliente.credito);
        
        trabajador.edad = 24;
        trabajador.nombre = "Ignacio";
        trabajador.telefono = 344456579;
        trabajador.salario = 850000;
        System.out.println("Me llamo "+trabajador.nombre+", tengo "+trabajador.edad+" años, mi telefono es "+trabajador.telefono+
                " y tengo un credito total de "+trabajador.salario);
        
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}