package edad;

import javax.swing.JOptionPane;

public class Edad {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD: "));
        if (edad < 18) {
            System.out.println("ERES MENOR DE EDAD");
        }else {
            System.out.println("MAYOR DE EDAD");
        }
    }    
}