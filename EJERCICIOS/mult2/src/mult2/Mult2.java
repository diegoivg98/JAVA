package mult2;
import javax.swing.JOptionPane;
public class Mult2 {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO")); 
        int x = 0;
        while (n2!=0){
            x = (int) (x + n1);
            n2 = n2 - 1;
        }
        System.out.println(x); //multiplicacion sin usar *
    }
}