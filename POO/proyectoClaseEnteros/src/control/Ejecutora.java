package control;
import modelo.Entero;
public class Ejecutora {    
    public static void main(String[] args) {
        Entero n = new Entero(42);
        Entero m = new Entero(56);
 
        
        System.out.println(n.multiplicar(m));
         }   
}