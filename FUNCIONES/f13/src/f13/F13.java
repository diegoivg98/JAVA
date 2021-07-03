package f13;
import javax.swing.JOptionPane;
public class F13 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("INGRESA UN NUMERO"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("INGRESA UN NUMERO"));
        System.out.println(comp(a,b));
    }
    //FUNCION QUE RETORNA 0 SI AMBOS NUMEROS SON IGUALES, 1 SI EL PRIMERO ES MAYOR QUE EL SEGUNDO, 2 LO CONTRARIO AL ANTERIOR
    public static int comp(int x, int y){
        if (x==y) {
            return 0;
        }else if (x>y) {
            return 1;
        }else if (y>x) {
            return 2;
        }
        return 0;
    }
}
