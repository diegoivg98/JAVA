
package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class MiMap {
    private Map map;
    public MiMap(){
        this.map = new HashMap();
    }
    public void adicionar(Object clave, Object valor){
        this.map.put(clave, valor);
    }
    public void eliminar(Object clave){
        this.map.remove(clave);
    }
    public void reemplazar(Object clave, Object valor){
        this.map.replace(clave, valor);
       
    }
    public boolean esVacio(){
        return this.map.isEmpty();
    }
    public void imprimir(){
        //Set claves = this.map.keySet();
        Collection valores = this.map.values();
        Iterator it = valores.iterator();
        while(it.hasNext()){
            Persona p = (Persona)it.next();
            System.out.println(p.getRut()+" "+p.getNombre()+ " "+ p.getApellido()+ " email :"+p.getEmail());
        }
    }  
    
    public ArrayList<Persona> obtenerValores(Set claves){
        
        Iterator it = claves.iterator();
        ArrayList <Persona> elementos = new <Persona>ArrayList();
        
        while(it.hasNext()){
            Persona p = (Persona)this.map.get(it.next());
            elementos.add(p);
        }
        
        return elementos;
    }
    public void imprimirClavesValores(){
        Set datos = this.map.entrySet();
        System.out.println(datos);
    }
}
