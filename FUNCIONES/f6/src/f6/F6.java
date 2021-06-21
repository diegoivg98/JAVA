package f6;
public class F6 {
    public static void main(String[] args) {
        int a1 = textoigual("diego","diego");
        int a2 = textoigual("asd","jhjhhj");
        System.out.println(a1);
        System.out.println(a2);
    }
    public static int textoigual(String t1, String t2){
        if (t1==t2) {
            return 1;
        }else{
            return 0;
        }
    }
}
