package fib;
public class Fib {
    public static void main(String[] args) {
        int x,y;
        x=1;
        y=0;
        for (int i = 0; i < 10; i++) {
            int z = x+y;
            x=y;
            y=z;
            System.out.println(z);//IMPRIMIR LOS 10 TERMINOS DE LA SERIE FIBONACCI
        }
    }   
}
