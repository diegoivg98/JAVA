package division;

import javax.swing.JOptionPane;

public class Division {
    public static void main(String[] args) {
        //INGRESAR NUMEROS, SI EL SEGUNDO ES IGUAL A 0 IMPRIMIR ERROR, DE LO CONTRARIO REALIZA LA DIVISION
        int n1,n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
        if (n2 == 0) {
            System.out.println("ERROR, NO SE PUEDE DIVIDOR POR 0");
        }else{
            System.out.println(n1/n2);
        }
    }   
}
