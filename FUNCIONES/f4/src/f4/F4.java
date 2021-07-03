package f4;
public class F4 {
    public static void main(String[] args) {
        String h1 = valhora(10,34,55);
        String h2 = valhora(60,90,80);
        System.out.println(h1);
        System.out.println(h2);
    }
    //FUNCION QUE VALIDA LA HORA, SI CUMPLE RETORNA "OK", DE NO CUMPLIR RETORNA "NO"
    public static String valhora (int h, int m, int s){
        if (h<=23 && m<=59 && s<=59 && h>=0 && m>=0 && s>=0){
            String r1 = "OK";
            return r1;
        }
        else{
            String r2 = "NO";
            return r2;
        }
    }
}
