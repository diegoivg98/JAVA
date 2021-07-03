package edad;
import javax.swing.JOptionPane;
public class Edad {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        for (int i = 0; i < edad; i++) {
            System.out.println(i+1 +" "+"años");//IMPRIMIR CUANTOS AÑOS TIENES, CONTANDO DESDE EL 1
        }
    }   
}
