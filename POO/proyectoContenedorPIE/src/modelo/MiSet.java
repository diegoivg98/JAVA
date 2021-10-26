
package modelo;

import java.util.HashSet;
import java.util.Set;

public class MiSet {
    private Set elementos;
    
    public MiSet(){
        this.crear();
    }
    private void crear(){
        this.elementos = new HashSet();
    }
    public void anadir(Object elem){
        elementos.add(elem);
    }
    
    public void eliminar(Object elem){
        elementos.remove(elem);
    }    
    public void imprimir(){
        for(Object e:elementos)
            System.out.print("["+e+"]");
        System.out.println("");
    }
}
