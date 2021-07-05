package formulageneral;
public class Formulageneral {
    public static void main(String[] args) {
        int a=4,b=5,c=-3;
        double d = Math.pow(b, 2)- 4*a*c;
        double x1 = (-b+Math.sqrt(d))/(2*a);//solucion 1
        double x2 = (b+Math.sqrt(d))/(2*a);//solucion 2
        System.out.println(x1);
        System.out.println(x2);
    }   
}