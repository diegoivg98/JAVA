package control;
import modelo.Lista;
public class Ejecutora {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.anDer(10).anDer(15).anDer(5).anDer(20).anDer(15).imprimir(); 
        l.ordenarPorInsercion().imprimir();
        //l.insertarOrdenada(10).insertarOrdenada(20).insertarOrdenada(5).imprimir();
        System.out.println("Es vacia ? "+l.esVacia());
        if(!l.esVacia()){
            System.out.println("Izquierda "+l.getIzq());
            System.out.println("Derecha "+l.getDer());
        }
        System.out.println("Esta ordenada ? "+l.estaOrdenada());
    }
}