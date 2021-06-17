package modelo;
public class Nodo {
    private Object elem;
    private Nodo sig;
    public Nodo(Object elem) {
        this.setElem(elem);
    }
    private void setElem(Object elem) {
        this.elem = elem;
    }
    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    public Object getElem() {
        return elem;
    }
    public Nodo getSig() {
        return sig;
    }
}
