package modelo;
import java.lang.Math;
public class Espacio {
    private Punto [] puntos;     
    public Espacio(int numPuntos, int valMinimo, int valMaximo){
        this.crear(numPuntos, valMinimo, valMaximo);
    }
    private void crear(int numPuntos, int valMinimo, int valMaximo){
        this.puntos =  new Punto[numPuntos];
        this.inicializar(valMinimo, valMaximo);
    }    
    private void inicializar(int valMinimo, int valMaximo){
        int rango = valMaximo - valMinimo + 1;        
        for (int i = 0; i < puntos.length; i++) {
            int coorX = (int)(Math.random()*rango) + valMinimo;
            int coorY = (int)(Math.random()*rango) + valMinimo;            
            puntos[i] = new Punto(coorX, coorY);            
        }
    }    
    public void imprimirPuntos(){
        for (int i = 0; i < puntos.length; i++) {
            //Punto p = puntos[i];
            System.out.println("punto "+(i+1)+" coordenadas x = "+puntos[i].getCoordX()+", y = "+puntos[i].getCoordY());
        }
    }
}
