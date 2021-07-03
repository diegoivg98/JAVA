package f12;
public class F12 {
    public static void main(String[] args) {
        cuadrado(3);
    }
    //FUNCION QUE RETORNA EL AREA Y PERIMETRO DE UN CUADRADO
    public static int cuadrado (int x){
        int area = x*x;
        int perimetro = x*4;
        System.out.println(area);
        System.out.println(perimetro);
        return 0;
    }
}
