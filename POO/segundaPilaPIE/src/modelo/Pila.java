package modelo;
public class Pila {
    private Nodo tope;
    private int profundidad;
    public Pila() {
        this.crear();
    }
    private void crear(){
        this.tope = null;
        this.profundidad = 0;
    }
    public void push(Object elem){
        Nodo nuevo = new Nodo(elem);
        if(!this.isEmpty())
            nuevo.setSig(tope);
        this.tope = nuevo;
        this.profundidad++;
    }
    public void pop(){
        if(!this.isEmpty()){
            this.tope = this.tope.getSig();
            this.profundidad--;
        }
    }
    public Object top(){
        return this.tope.getElem();
    }
    public boolean isEmpty(){
        return this.tope == null;
    }
    public int profundidad(){
        return this.profundidad;
    }    
    public Object fondo(){
        Nodo e = this.tope;
        while(e!=null){
            if(e.getSig() == null)
                return e.getElem();
            e = e.getSig();
        }
        return e; 
    }  
    public void imprimirPila(){
        Nodo reco = this.tope;
        while(reco != null){
            System.out.print("["+reco.getElem()+"]-");
            reco = reco.getSig();
        }
        System.out.println("");
    }    
    private Pila apilarInversa(Pila q){
        Nodo reco = this.tope;
        while(reco != null){            
            q.push(reco.getElem());
            reco = reco.getSig();
        }
        return q;
    }   
    public Pila inversa(){
         return this.apilarInversa(new Pila());
    }
}