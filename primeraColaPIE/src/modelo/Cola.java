package modelo;
import java.util.List;
import java.util.ArrayList;
public class Cola {
    private List elementos;
    public Cola() {
        this.crear();
    }    
    private void crear(){
        this.elementos = new ArrayList();
    } 
    //añadir elementos de la cola
    public void encolar(Object elem){
        this.elementos.add(elem);
    }    
    //quitar elementos de la cola
    public void desencolar(){
        if(!this.esVacia())
            this.elementos.remove(0);
    }
    public Object frente(){
        return this.elementos.get(0);
    }    
    public int largo(){
        return this.elementos.size();
    }    
    public boolean esVacia(){
        return this.largo() == 0;
    }
    //trae el ultimo elemento de la cola
    public Object ultimo(){
        return this.elementos.get(this.largo()-1);
    }
    
    //invertir datos de la cola
    public void invertir(){
        if(!this.esVacia()){
            Object elem = this.frente();
            this.desencolar();
            this.invertir();
            this.encolar(elem);
        }
    }
    //imprimir elementos de la cola
    public void imprimirCola(){
        for (Object e : this.elementos) 
            System.out.print("["+e+"]");
        System.out.println("");
    }
}