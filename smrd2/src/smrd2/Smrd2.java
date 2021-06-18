package smrd2;
import java.util.Scanner;
public class Smrd2 {
    public static void main(String[] args) {
        int n1,n2,suma,resta,mult,div;
 
       Scanner scanner = new Scanner (System.in);
        System.out.print ("Ingrese numero: ");
        n1 = scanner.nextInt();
        System.out.print ("Ingrese numero: ");
        n2 = scanner.nextInt();
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
