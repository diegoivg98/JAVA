package decbin;
import javax.swing.JOptionPane;
public class Decbin {
    public static void main(String[] args) {
        int bin = 0;
        int exp = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        System.out.println("NUMERO DECIMAL: "+num);
        //CONVERTIR UN NUMERO DECIMAL A BINARIO
        while(num!=0){
            int res = num % 2;
            bin += res*Math.pow(10, exp);
            exp++;
            num /= 2;
        }
        System.out.println("NUMERO BINARIO: "+bin);
    }   
}
