package octdec;
import javax.swing.JOptionPane;
public class Octdec {
    public static void main(String[] args) {
        int num = 0;
        int decimal = 0;
        int exp = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        System.out.println("NUMERO OCTAL: "+num);
        //CONVERTIR NUMERO OCTAL A DECIMAL
        while (num!=0){
            int res = num % 10;
            decimal += res*Math.pow(8, exp);
            exp++;
            num /= 10;         
        }
        System.out.println("NUMERO DECIMAL: "+decimal);
    }   
}
