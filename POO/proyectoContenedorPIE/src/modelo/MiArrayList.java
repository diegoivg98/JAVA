package modelo;
import java.util.ArrayList;
import java.util.List;
public class MiArrayList {
    private List arreglo;
    public MiArrayList(){
        this.crear();
    }
    private void crear(){
        this.arreglo = new ArrayList();
    }
    public void anadir(Object elem){
        arreglo.add(elem);
    }
    public void anadir(int pos,Object elem){
        arreglo.add(pos, elem);
    }
    public Object getElem(int pos){
        return arreglo.get(pos);
    }
    public void imprimir(){
        for(Object e:arreglo)
            System.out.print("["+e+"]");
        System.out.println("");
    }
    public void eliminar(int pos){
        arreglo.remove(pos);
    }
}