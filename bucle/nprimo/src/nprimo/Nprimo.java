package nprimo;
import javax.swing.JOptionPane;
public class Nprimo {
    public static void main(String[] args) {
        //INGRESAR UN NUMERO, VERIFICAR SI ES PRIMO O NO
        int num = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        int i = 2;
        while(num % i != 0){
            i += 1;
        }
        if (i == num) {
            System.out.println(num+" es primo");
        }else{
            System.out.println(num+" no es primo ");
        }
    }   
}
