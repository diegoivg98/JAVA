package parimpar;
import javax.swing.JOptionPane;
public class Parimpar {
    public static void main(String[] args) {
        //INGRESAR UN NUMERO, VERIFICAR SI ES PAR O IMPAR
        int num = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
        if (num % 2 == 0) {
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }   
}
