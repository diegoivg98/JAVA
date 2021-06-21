package f2;
import javax.swing.JOptionPane;
public class F2 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("INGRESE UNA PALABRA");
        System.out.println(condicion(a));
    }
    public static String condicion(String n) {
        if (n.length()>10 && n.length()<100) {
            n = "OK";
        }
        else{
            n="NO";
        }      
        return n;
    }
}