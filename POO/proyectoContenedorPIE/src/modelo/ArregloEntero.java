package modelo;

public class ArregloEntero {
    private int[] arreglo;
    public ArregloEntero() {
        this.crear(10);
    }
    public ArregloEntero(int tama) {
        this.crear(tama);
    }
    private void crear(int tama) {
        this.arreglo = new int[tama];
        this.inicializar();
    }
    private void inicializar() {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }
    }
    public int getTama(){
        return arreglo.length;
    }
    public void anadir(int pos, int elem){
        if(pos >= 0 && pos < arreglo.length)//estoy dentro de los limites
            arreglo[pos] = elem;
        else{
            System.out.println("Fuera de los límites permitidos!");}
    }
    public int getElem(int pos){
        return arreglo[pos];
    }
    public void imprimir(){
        for(int elem:arreglo)
            System.out.print("["+elem+"]");
        System.out.println("");
    }
}
