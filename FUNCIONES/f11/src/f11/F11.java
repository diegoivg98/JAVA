package f11;
public class F11 {
    public static void main(String[] args) {
        System.out.println(cambioclp(1,1));
        System.out.println(cambioclp(1,2));
        System.out.println(cambioclp(1,3));
    }
    //CREAR FUNCION QUE DEVUELVA LA CONVERSION DE PESOS CHILENOS A DOLAR, EURO O YENES
    //Y ES LA OPCION A CONVERTIR, X ES LA CANTIDAD DE PESOS CHILENOS
    public static double cambioclp (double x, double y){
        if (y==1) {
            return x*0.0014;//DOLAR
        }
        if (y==2) {
            return x*0.0013;//EURO
        }
        if (y==3) {
            return x*0.15;//YENES
        }
        return 0;
    }
}
