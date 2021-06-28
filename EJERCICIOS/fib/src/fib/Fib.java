package fib;
public class Fib {
    public static void main(String[] args) {
        int x,y;
        x=1;
        y=0;
        System.out.println("10 TERMINOS SERIE FIBONACCI");
        for (int i = 0; i < 10; i++) {
            int z = x+y;
            x=y;
            y=z;
            System.out.println(z);
        }
    }   
}