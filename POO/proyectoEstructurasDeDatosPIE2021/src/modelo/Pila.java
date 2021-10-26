package modelo;
public class Pila {
    private Lista personas;

    public Pila() {
        this.crear();
    }    
    private void crear(){
        personas = new Lista();
    }
    public Pila push(Persona p){
        personas.anIzq(p);
        return this;
    }
    public Persona top(){
        return personas.getIzq();
    }
    public Pila pop(){
        personas.elimIzq();
        return this;
    }
    public boolean isEmpty(){
        return personas.esVacia();
    }
}
