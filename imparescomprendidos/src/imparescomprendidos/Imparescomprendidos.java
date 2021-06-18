package imparescomprendidos;
public class Imparescomprendidos {
    public static void main(String[] args) {
        System.out.println("IMPARES COMPRENDIDOS ENTRE 222 Y 674");
        
        for (int i = 222; i < 674; i++) {
            if (i%2!=0) {
                System.out.println(i);   
            }
        }
    }
}