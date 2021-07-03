
package control;
import java.util.ArrayList;
import modelo.Conjunto;
import modelo.MiMap;
import modelo.Persona;
import modelo.ClaseDatosPersonas;
public class Ejecutora {
    public static void main(String[] args) {
        Conjunto c = new Conjunto();
        c.adicionarElemento("uno");
        c.adicionarElemento("dos");
        c.adicionarElemento("tres");
        c.adicionarElemento("uno");// no se adiciona (duplicado)
        c.adicionarElemento("tres"); // no se adiciona (duplicado)
        c.eliminar("cuatro");
        c.eliminar("uno");
        c.eliminar("dos");
        c.eliminar("tres");
        c.imprimirConjunto();
        System.out.println("El conjunto es vacio? "+c.esVacio());
        
        MiMap m = new MiMap();        
        Persona p = new Persona(15282691, "Juan", "Perez", "jperez@gmail.com","6 oriente 1251");        
        m.adicionar(p.getRut(), p);
        m.adicionar(18171256, new Persona(18171256, "Pedro", "Rojas", "projas@gmail.com","32 oriente 1855"));
        m.adicionar(22553789, new Persona(22553789, "Pedro", "Rojas", "projas01@gmail.com","32 oriente 1855"));
        m.imprimir();
        System.out.println("Es vacio? "+m.esVacio());
        
        ClaseDatosPersonas cdp = new ClaseDatosPersonas();
        Conjunto c2 = cdp.obtenerRut();
        c2.imprimirConjunto();
        
        ArrayList <Persona> arr = cdp.datosPersonas().obtenerValores(c2.obtenerElementos());
        for(Persona pe : arr)
            System.out.println(pe.getNombre()+" "+pe.getApellido());
        
    }
}
