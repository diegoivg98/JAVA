package f9;
public class F9 {
    public static void main(String[] args) {
        int r1 = largo("diego");
        int r2 = largo("neumatico");
        System.out.println(r1);
        System.out.println(r2);
    }
    //FUNCION QUE RETORNA EL LARGO DE UNA PALABRA
    public static int largo (String t){
       int res;
        res = t.length();
        return res;
    }
}
