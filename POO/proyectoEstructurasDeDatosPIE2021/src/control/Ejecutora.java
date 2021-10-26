package control;
import modelo.Lista;
import modelo.Persona;
import modelo.Pila;
import modelo.Cola;
public class Ejecutora {
    public static void main(String[] args) {
        //if(false){
        Lista l = new Lista();
        l.anIzq(new Persona(15238564, "Juan", "Perez", "2 sur 385"));
        l.anDer(new Persona(12321628, "Jose", "Castro", "1 norte 235"));
        l.anIzq(new Persona(13441782, "María", "Gonzalez", "13 norte 1225"));
        l.imprimir();
        //l.getNElemIzq(4).imprimir();
        l.elimNElemIzq(1).imprimir();
        System.out.println("La posicion de la persona es "+l.posicion(13441782));
        System.out.println("El largo de la lista es "+l.largo());
        System.out.println("La lista es vacia ?"+l.esVacia());
           
        if(!l.esVacia())
            System.out.println("La persona de la derecha es "+l.getDer().toString());
        if(!l.esVacia())
            System.out.println("La persona de la izquierda es "+l.getIzq().toString());
        //}    
        if(false){
        Pila p = new Pila();
        p.push(new Persona(15238564, "Juan", "Perez", "2 sur 385"));
        p.push(new Persona(12321628, "Jose", "Castro", "1 norte 235"));
        p.push(new Persona(13441782, "María", "Gonzalez", "13 norte 1225")); 
        System.out.println("La pila es vacia ? ="+p.isEmpty());
        if(!p.isEmpty())
            System.out.println("El tope es "+p.top());       
        }
        if(false){
        Cola c = new Cola();
        c.encolar(new Persona(15238564, "Juan", "Perez", "2 sur 385"));
        c.encolar(new Persona(12321628, "Jose", "Castro", "1 norte 235"));
        c.encolar(new Persona(13441782, "María", "Gonzalez", "13 norte 1225"));
        c.desencolar().desencolar();
        System.out.println("La cola es vacia ? ="+c.esVacia());
        if(!c.esVacia())
            System.out.println("El frente de la cola es "+c.frente().toString());
        }
    }
}