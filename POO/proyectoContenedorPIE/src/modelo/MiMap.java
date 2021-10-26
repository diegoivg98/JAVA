package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MiMap {
    private Map elementos;
    public MiMap(){
        this.crear();
    }
    private void crear(){
        elementos = new HashMap();
    }
    public void anadir(Object clave, Object valor){
        elementos.put(clave, valor);
    }
    public void eliminar(Object clave){
        elementos.remove(clave);
    }
    public Object getElemen(Object clave){
        return elementos.get(clave);
    }
    public void imprimir(){
        Collection elementos = this.elementos.values();
        Set claves = this.elementos.keySet();
        for(Object e: elementos)
            System.out.print("["+e+"]");
        System.out.println("");
        for(Object e:claves.toArray())
            System.out.print("["+e+"]");
        System.out.println("");
    }
}