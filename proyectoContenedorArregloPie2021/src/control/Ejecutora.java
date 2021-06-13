package control;
import java.lang.Math;
import modelo.Espacio;
import modelo.Espacio3D;
public class Ejecutora {
    public static void main(String[] args) {
        
        // Arreglo de 20 puntos con coordenadas espaciales
        // entre -10 y 10 obtenidas de forma aleatoria
        Espacio miEspacio = new Espacio(20, -10, 10);
        //impresion de valores de las posiciones aleatorias de los puntos
        miEspacio.imprimirPuntos();
      
        // Matriz 3D de 4x5x3 conde cada celda contiene puntos
        // (con valores aleatorios)
        Espacio3D miEspacio3d = new Espacio3D(4,5,3);
        //llamamos la función inicializar la cual dejamos de forma pública
        miEspacio3d.inicializar();
        // imprimimos la matriz como matrices 2D, avanzando en la coordenada z
        miEspacio3d.imprimir();
    }
}
