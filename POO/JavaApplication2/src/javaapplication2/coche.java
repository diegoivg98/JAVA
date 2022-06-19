package javaapplication2;
public class coche {
   private int puertas;

    public coche(int puertas) {
        this.puertas = puertas;
    }
    
    //función que incremente el número de puertas que tiene el coche.
    public void inc_puertas (int puertas){  
            this.puertas += puertas;
    }
    
    //Mostrar el número de puertas que tiene el objeto.
    public void mensaje(){
        System.out.println("El numero de puertas del coche es: " +puertas);
    }
    
    public static void main(String[] args) {
        //Crear un objeto miCoche en el main y añadirle una puerta.
        coche miCoche = new coche(4);
        miCoche.inc_puertas(1);
        miCoche.mensaje();
    }
}