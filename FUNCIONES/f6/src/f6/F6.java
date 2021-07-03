package f6;
public class F6 {
    public static void main(String[] args) {
        int a1 = textoigual("diego","diego");
        int a2 = textoigual("asd","jhjhhj");
        System.out.println(a1);
        System.out.println(a2);
    }
    //FUNCION QUE RETORNE 1 SI AMBOS TEXTOS SON IGUALES, 0 EN CASO DE NO CUMPLIR
    public static int textoigual(String t1, String t2){
        if (t1==t2) {
            return 1;
        }else{
            return 0;
        }
    }
}
