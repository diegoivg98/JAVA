package raices;
import javax.swing.JOptionPane;
public class Raices {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        System.out.println("la raiz de " +num+" es: "+Math.sqrt(num));
    }   
}