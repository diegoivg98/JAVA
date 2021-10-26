    
package modelo;

public class Nodo {
    private Object elem;
    private Nodo sig;
    private Nodo ant;

    public Nodo(Object elem) {
        this.setElem(elem);
        this.setSig(null);
        this.setAnt(null);
    }

    public Object getElem() {
        return elem;
    }

    private void setElem(Object elem) {
        this.elem = elem;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
    
}
