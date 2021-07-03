package f3;
import javax.swing.JOptionPane;
public class F3 {
    public static void main(String[] args) {
        double a;
        a = Double.parseDouble(JOptionPane.showInputDialog("INGRESA UNA CANTIDAD DE DOLARES"));
        System.out.println(dolaraeuro(a)+" EUROS");
    }
    //FUNCION QUE CONVIERTE DOLAR A EURO
    public static double dolaraeuro(double c){
        double res = c * 0.84;
        return res;
    }
}
