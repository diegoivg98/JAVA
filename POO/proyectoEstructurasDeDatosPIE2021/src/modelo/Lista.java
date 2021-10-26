package modelo;

public class Lista {
    private NodoLista derecha;
    private NodoLista izquierda;
    private Integer largo;
    public Lista() {
        this.crear();
    }    
    public Lista anDer(Persona p){
        NodoLista n = new NodoLista(p);
        if(this.esVacia())
            izquierda = n;
        else{
          n.setRelIzq(derecha);
          derecha.setRelDer(n);
        }            
        derecha = n;
        largo++;
        return this;
    }
    public Lista anIzq(Persona p){
        NodoLista n = new NodoLista(p);
        if(this.esVacia())
            derecha = n;
        else{
          n.setRelDer(izquierda);
          izquierda.setRelIzq(n);
        }            
        izquierda = n;
        largo++;
        return this;
    }
    public Persona getDer(){
        return derecha.getPersona();
    }
    public Persona getIzq(){
        return izquierda.getPersona();
    }
    public Lista elimIzq(){
        if(!this.esVacia())
            if(izquierda.equals(derecha))
                this.crear();
            else{
                NodoLista aux = izquierda;
                izquierda.getRelDer().setRelIzq(null);
                izquierda = izquierda.getRelDer();
                aux = null;
                largo--;
                System.gc();
            }
        return this;
    }
    public Lista elimDer(){
        if(!this.esVacia())
            if(izquierda.equals(derecha))
                this.crear();
            else{
                NodoLista aux = derecha;
                derecha.getRelIzq().setRelDer(null);
                derecha = derecha.getRelIzq();
                aux = null;
                largo--;
                System.gc();
            }
        return this;
    }
    private void crear(){
        derecha = izquierda = null;
        largo = 0;
    }    
    public boolean esVacia(){
        return derecha == null && izquierda == null;
    }
    
    public Integer largo(){
        return largo;
    }
    /*
       EJERCICIO TIPO PRUEBA:
       Extender la lista con las siguientes operaciones:
          - Obtener una sublista de los n elementos de mas a la izquierda de la lista
          - Obtener una sublista de los elementos eliminando los n de más a la izquierda ¡
          - determinar si un elemento está en la lista
          - determinar la posicion de un elemento (devolviendo -1 si no esta)
          - obtener el elemento en la posicion n de la lista
    */
    public Lista getNElemIzq(Integer n){
        Lista l = new Lista();
        NodoLista reco = izquierda;
        for (int i = 0; i < n; i++) {
            if(i < this.largo()){
               l.anDer(reco.getPersona());
              reco = reco.getRelDer(); 
            }
        }
        return l;        
    }
    
    public Lista elimNElemIzq(Integer n){
        Lista l = new Lista();
        NodoLista reco = izquierda;
        for (int i = 0; i < this.largo(); i++) {           
               l.anDer(reco.getPersona());
              reco = reco.getRelDer();             
        }
        for(int i = 0; i < n; i++)
            l.elimIzq();
        return l;
    }
    
    public void imprimir(){
        NodoLista reco = izquierda;
        while(reco!= null){
            System.out.print("["+reco.getPersona().getNombre()+"]");
            reco = reco.getRelDer();
        }
        System.out.println("");
    }
    
    public int posicion(int rut){
        //int rut = p.getRut();
        NodoLista reco = izquierda;
        for (int i = 0; i < this.largo(); i++) {  
            if(reco.getPersona().getRut() == rut)
                return i;
            reco = reco.getRelDer();            
        }
        return -1;
    }
}
