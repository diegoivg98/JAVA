
package modelo;

public class ArregloString {
     private String [] arreglo;
    public ArregloString() {
        this.crear(10);
    }
    public ArregloString(int tama) {
        this.crear(tama);
    }
    private void crear(int tama) {
        this.arreglo = new String[tama];
        this.inicializar();
    }
    private void inicializar() {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = "";
        }
    }
    public int getTama(){
        return arreglo.length;
    }
    public void anadir(int pos, String elem){
        if(pos >= 0 && pos < arreglo.length)//estoy dentro de los limites
            arreglo[pos] = elem;
        else{
            System.out.println("Fuera de los límites permitidos!");}
    }
    public String getElem(int pos){
        return arreglo[pos];
    }
    public void imprimir(){
        for(String elem:arreglo)
            System.out.print("["+elem+"]");
        System.out.println("");
    }
    public void concatenar(int pos, String elem){
        if(pos >= 0 && pos < arreglo.length)//estoy dentro de los limites
            arreglo[pos] = arreglo[pos].concat(elem);
        else{
            System.out.println("Fuera de los límites permitidos!");}
    }
}
