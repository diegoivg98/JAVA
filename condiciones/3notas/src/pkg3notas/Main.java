package pkg3notas;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //INGRESAR 3 NOTAS, VERIFICAR SI APRUEBA O REPRUEBA
        double n1,n2,n3,prom;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        prom = (n1+n2+n3)/3;
        if (prom >= 4.0) {
            System.out.println("APROBADO");
        }else{
            System.out.println("REPROBADO");
        }
    }
}
