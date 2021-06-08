
package control;
import modelo.Cola;
public class Ejecutora {
    public static void main(String[] args) {
        Cola c = new Cola();
        c.encolar("Hola mundo");
        c.encolar(10);
        c.encolar(true);
        
        c.imprimirCola();//[Hola mundo][10][true]
        c.invertir();
        c.imprimirCola();//[true][10][Hola mundo]
    }
}
