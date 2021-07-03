package bindec;
import javax.swing.JOptionPane;
public class Bindec {
    public static void main(String[] args) {
        int num,ult_dig,cont=0,decimal=0;
        num = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        System.out.println("NUMERO BINARIO: "+num);
        //CONVERTIR NUMERO BINARIO A DECIMAL
        while(num!=0){
            ult_dig = num%10;
            decimal += (ult_dig * Math.pow(2, cont));
            cont++;
            num /= 10;
        }
        System.out.println("NUMERO DECIMAL: "+decimal);
    }
}   
