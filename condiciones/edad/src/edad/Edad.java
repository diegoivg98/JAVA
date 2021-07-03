package edad;
import javax.swing.JOptionPane;
public class Edad {
    public static void main(String[] args) {
        //INGRESAR UNA EDAD, SI ES >18 IMPRIMIR QUE ES MAYOR DE EDAD, DE LO COTRARIO IMPRIMIR QUE ES MENOR DE EDAD
        int edad = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD: "));
        if (edad < 18) {
            System.out.println("ERES MENOR DE EDAD");
        }else {
            System.out.println("MAYOR DE EDAD");
        }
    }    
}
