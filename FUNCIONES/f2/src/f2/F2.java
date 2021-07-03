package f2;
import javax.swing.JOptionPane;
public class F2 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("INGRESE UNA PALABRA");
        System.out.println(condicion(a));
    }
    //FUNCION QUE RETORNE "OK" SI EL LARGO DE LA PALABRA ES >10 Y <100, DE NO CUMPLIR RETORNA "NO"
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
