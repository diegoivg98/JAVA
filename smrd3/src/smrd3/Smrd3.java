package smrd3;

import javax.swing.JOptionPane;

public class Smrd3 {
    public static void main(String[] args) {
        int n1,n2,suma,resta,mult,div;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        
        suma = n1+n2;
        resta = n1-n2;
        mult = n1*n2;
        div = n1/n2;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(mult);
        System.out.println(div);

    }
}