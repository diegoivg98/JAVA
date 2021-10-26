package modelo;
public class Lista implements InterfaceLista{
    private NodoLista derecha;
    private NodoLista izquierda;
    public Lista() {
        this.crear();
    }
    private void crear(){
        derecha = izquierda = null;
    }
    @Override
    public Lista anDer(Integer elem) {
        NodoLista n = new NodoLista(elem);
        if(this.esVacia()){            
            izquierda = n;
        }
        else{
            derecha.setRelDer(n);
            n.setRelIzq(derecha);          
        }
        derecha = n;        
        return this;
    }
    @Override
    public Lista anIzq(Integer elem) {
        NodoLista n = new NodoLista(elem);
        if(this.esVacia()){            
            derecha = n;
        }
        else{
            izquierda.setRelIzq(n);
            n.setRelDer(izquierda);          
        }
        izquierda = n;        
        return this;
    }
    @Override
    public Lista elimDer() {
        if(!this.esVacia()){
            if(izquierda == derecha)
                this.crear();
            else{
                NodoLista aux = derecha;
                derecha = derecha.getRelIzq();
                derecha.setRelDer(null);
                aux = null;
                System.gc();
            }
        }
        return this;
    }
    @Override
    public Lista elimIzq() {
        if(!this.esVacia()){
            if(izquierda == derecha)
                this.crear();
            else{
                NodoLista aux = izquierda;
                izquierda = izquierda.getRelDer();
                izquierda.setRelIzq(null);
                aux = null;
                System.gc();
            }
        }
        return this;
    }
/*
      l1.crear().estaOrdenada() == b.true()
      l1.crear().anIzq(e1).estaOrdenada() == b.true()
      l1.crear().anDer(e1).estaOrdenada() == b.true()
      
      l1.anDer(e1).anDer(e2) == (e1 <= e2) and l1.estaOrdenada()
    */
    @Override
    public boolean estaOrdenada() {
        if(this.esVacia())
            return true;
        if(this.izquierda == this.derecha)
            return true;
        Integer elem = this.getIzq();
        Lista l = this.elimIzq();
        return elem <= l.getDer() && l.estaOrdenada();        
    }
 /*
       l1.crear().ordenarPorInsercion() == l1.crear()
       l1.anIzq(e1).ordenarPorInsercion() == l1.ordenarPorInsercion().insertarOrdenado(e1)
    */
    @Override
    public Lista ordenarPorInsercion() {
        if(!this.esVacia()){
            Integer izq = this.getIzq();
            this.elimIzq().ordenarPorInsercion().insertarOrdenada(izq);
        }
        return this;
    }
    
    public boolean esVacia(){
        return derecha == null && izquierda == null;
    }
    
    public Integer getIzq(){
        return izquierda.getElem();
    }
    public Integer getDer(){
        return derecha.getElem();
    }
    /*
       l1.crear().insertarOrdenada(e1) == l1.crear().anIzq(e1)
       l1.anIzq(e1).insertarOrdenada(e2) == l1.anIzq(e1).anIzq(e2) <-- (e1 <= e2)
       l1.anIzq(e1).insertarOrdenada(e2) == l1.insertarOrdenada(e2).anIzq(e1) <-- e2 > e1
    */   
    @Override
    public Lista insertarOrdenada(Integer elem) {
        if(this.esVacia()){
            this.anDer(elem);
            return this;
        }
        if(elem <= this.getIzq()){
            this.anIzq(elem);    
            return this;
        }
        else
        {
            Integer izq = this.getIzq();
            //Lista l = this.elimIzq();
            return this.elimIzq().insertarOrdenada(elem).anIzq(izq);            
        }                    
    }
   
    public void imprimir(){
        NodoLista reco = izquierda;
        while(reco !=null){
            System.out.print("["+reco.getElem()+"]");
            reco = reco.getRelDer();
        }
        System.out.println("");
    }
}