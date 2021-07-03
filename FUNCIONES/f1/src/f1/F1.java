package f1;
public class F1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5; 
        System.out.println(suma(a,b));
        System.out.println(resta(a,b));
        System.out.println(mult(a,b));
        System.out.println(div(a,b));
    }
    //CREAR FUNCIONES QUE DEVUELVAN LA SUMA,RESTA,MULTIPLICACION Y DIVISION DE 2 NUMEROS
    public static int suma(int a, int b) {
        return a+b;       
    }
    public static int resta(int a, int b) {
        return a-b;       
    }
    public static int mult(int a, int b) {
        return a*b;       
    }
    public static double div(int a, int b) {
        return a/b;       
    }
}
