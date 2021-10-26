package modelo;

public class NodoLista {
    private NodoLista relDer;
    private NodoLista relIzq;
    private Persona persona;

    public NodoLista(Persona persona) {
        this.setPersona(persona);
        this.setRelDer(null);
        this.setRelIzq(null);
    }
    public void setRelDer(NodoLista relDer) {
        this.relDer = relDer;
    }
    public void setRelIzq(NodoLista relIzq) {
        this.relIzq = relIzq;
    }
    private void setPersona(Persona persona) {
        this.persona = persona;
    }
    public NodoLista getRelDer() {
        return relDer;
    }
    public NodoLista getRelIzq() {
        return relIzq;
    }
    public Persona getPersona() {
        return persona;
    }    
}
