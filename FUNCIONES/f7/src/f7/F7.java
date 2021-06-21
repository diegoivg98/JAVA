package f7;
public class F7 {
    public static void main(String[] args) {
        String r = reemplazar("odio al oso");//adia al asa
        System.out.println(r);
    }
    public static String reemplazar(String p){
        String res = p.replace("o", "a");//REEMPLAZAR LAS O POR A
        return res;
    }
}
