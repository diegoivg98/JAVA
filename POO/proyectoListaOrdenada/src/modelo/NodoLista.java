package modelo;
public class NodoLista {
    private Integer elem;
    private NodoLista relDer;
    private NodoLista relIzq;
    public NodoLista(Integer elem) {
        this.setElem(elem);
        this.setRelDer(null);
        this.setRelIzq(null);
    }
    private void setElem(Integer elem) {
        this.elem = elem;
    }
    public NodoLista setRelDer(NodoLista relDer) {
        this.relDer = relDer;
        return this;
    }
    public NodoLista setRelIzq(NodoLista relIzq) {
        this.relIzq = relIzq;
        return this;
    }
    public Integer getElem() {
        return elem;
    }
    public NodoLista getRelDer() {
        return relDer;
    }
    public NodoLista getRelIzq() {
        return relIzq;
    }
}