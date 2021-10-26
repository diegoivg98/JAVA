package control;
import modelo.*;

public class Ejecutora {
    public static void main(String[] args) {
        ArregloEntero ae = new ArregloEntero();
        ae.imprimir();
        for (int i = 0; i < ae.getTama(); i++) {
            ae.anadir(i, (int)(Math.random()*100));            
        }
        ae.imprimir();        
        ArregloString as = new ArregloString(3);
        as.imprimir();
        as.anadir(0, "Hola");
        as.anadir(1, "Mundo");
        as.anadir(2, "Cruel");
        
        as.imprimir();
        as.concatenar(1, " Hermoso y");
        as.imprimir();
        
        MiArrayList al = new MiArrayList();
        al.anadir("Hola");
        al.anadir(10);
        al.anadir(true);
        al.imprimir();
        
        MiSet ms = new MiSet();
        ms.anadir("Hola");
        ms.anadir("Hola");
        ms.anadir(10);
        ms.anadir("Chao");
        ms.imprimir();
        ms.eliminar("Chao");
        ms.imprimir();
        
        MiMap mm = new MiMap();
        mm.anadir(20304855, "Kliber");
        mm.anadir(20230086, "Michael");
        mm.anadir(19347293, "Pedro");
        mm.imprimir();
        
        Lista l = new Lista();
        l.anadirDer(10);
        l.anadirDer(20);
        l.anadirIzq(40);
        l.imprimir();
        l.eliminarIzq();
        l.eliminarDer();
        l.imprimir();
    }
}
