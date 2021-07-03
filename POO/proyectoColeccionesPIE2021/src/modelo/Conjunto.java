package modelo;
import java.util.HashSet;
import java.util.Set;
public class Conjunto {
    private Set conjunto;    
    public Conjunto(){
        this.conjunto = new HashSet();
    }    
    public void adicionarElemento(Object e){
        this.conjunto.add(e);
    }    
    public boolean esVacio(){
        return this.conjunto.isEmpty();
    }    
    public void eliminar(Object e){
        if(this.conjunto.remove(e))
            System.out.println("El elemento fue removido");
        else
            System.out.println("Elemento inexistente");
    }    
    public void imprimirConjunto(){
        System.out.println(conjunto);
    }
    
    public Set obtenerElementos(){
        return this.conjunto;
    }
}
