package tabmult;
import javax.swing.JOptionPane;
public class Tabmult {
    public static void main(String[] args) {
        //INGRESAR UN NUMERO, OBTENER SU TABLA DE MULTIPLICAR DEL 1 AL 10
       int num,res;
       num = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        for (int i = 1; i < 11; i++) {
            res = num * i;
            System.out.println(num+"X"+i+" = "+res);
        }
    }   
}
