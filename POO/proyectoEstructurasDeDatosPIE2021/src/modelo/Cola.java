
package modelo;

public class Cola {
    private Lista personas;
    public Cola() {
        this.crear();
    }    
    private void crear(){
        personas = new Lista();
    }
    public Cola encolar(Persona p){
        personas.anDer(p);
        return this;
    }
    public Cola desencolar(){
        personas.elimIzq();
        return this;
    }
    public Persona frente(){
        return personas.getIzq();        
    }
    public boolean esVacia(){
        return personas.esVacia();
    }
}
