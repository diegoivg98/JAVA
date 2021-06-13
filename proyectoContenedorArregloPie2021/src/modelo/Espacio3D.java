package modelo;
import java.lang.Math;
public class Espacio3D {
    private Punto puntos[][][];
    private int dim1, dim2,dim3;    
    public Espacio3D(int dim1, int dim2, int dim3){
        this.puntos = new Punto[dim1][dim2][dim3];
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }    
    public void inicializar(){
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                for (int k = 0; k < dim3; k++) {      
                    puntos[i][j][k] = new Punto((int)(1+ Math.random()*100), (int)(1+ Math.random()*100));
                }
            }            
        }
    }    
    public void imprimir(){
        for(int k = 0; k < dim3; k++){
          for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {                
                    System.out.print("["+puntos[i][j][k].getCoordX()+","+puntos[i][j][k].getCoordY()+"]");            
            }
              System.out.println("");
          }
          System.out.println("");          
        }            
    }
}
