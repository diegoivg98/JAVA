package modelo;
public class Lista {
    private Nodo derecha;
    private Nodo izquierda;
    Runtime r = Runtime.getRuntime();
    public Lista(){
        this.crear();
    }
    private void crear(){
        this.derecha = this.izquierda = null;
    }
    public void anadirIzq(Object elem){
        Nodo nuevo = new Nodo(elem);
        if(this.esVacia())
            this.derecha = nuevo;        
        else{
            this.izquierda.setAnt(nuevo);
            nuevo.setSig(izquierda);
        }
        izquierda = nuevo;
    }
    public void anadirDer(Object elem){
        Nodo nuevo = new Nodo(elem);
        if(this.esVacia()){
            this.izquierda = nuevo;
        }
        else{
            this.derecha.setSig(nuevo);
            nuevo.setAnt(this.derecha);            
        }
        derecha = nuevo;
    }
    public void eliminarIzq(){
        if(!this.esVacia()){
            if(derecha == izquierda)
                this.crear();
            else{
                izquierda.getSig().setAnt(null);
                Nodo aux = izquierda;
                izquierda = izquierda.getSig();
                aux.setSig(null);
                r.gc();
            }
        }
    }
    public void eliminarDer(){
        if(!this.esVacia()){
            if(derecha == izquierda)
                this.crear();
            else{
                derecha.getAnt().setSig(null);
                Nodo aux = derecha;
                derecha = derecha.getAnt();
                aux.setAnt(null);
                r.gc();
            }
        }
    }
    public void imprimir(){
        Nodo reco = this.izquierda;
        while(reco!= null){
            System.out.print("["+reco.getElem()+"]");
            reco = reco.getSig();
        }
        System.out.println("");
    }
    public boolean esVacia(){
        return this.derecha == null && this.izquierda== null;
    }
}