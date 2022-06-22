//EJEMPLO DE ENCAPSULACION 
package main;
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(23);
        System.out.println("Tengo " + persona.getEdad() + " años");
        persona.setNombre("Diego");
        System.out.println("Mi nombre es " + persona.getNombre());
        persona.setTelefono(962590557);
        System.out.println("Mi teléfono es " + persona.getTelefono());
    }    
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}