package control;
import modelo.Pila;
public class Ejecutora {
    public static void main(String[] args) {
        Pila p = new Pila();
        p.push("elemento del fondo");
        p.push(10);
        p.push(20);
        p.push("elemento del tope");
        p.imprimirPila();
        p.inversa().imprimirPila();
        
        
        /*
        Pila q = p.inversa();
        q.imprimirPila();
        p.pop();
        q.pop();
        System.out.println("El fondo de la pila P es "+p.fondo());
        System.out.println("El fondo de la pila Q es "+q.fondo());
        
        System.out.println("El tope de la pila P es "+p.top());
        System.out.println("El tope de la pila Q es "+q.top());
       */
    }
}
