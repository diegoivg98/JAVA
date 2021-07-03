package f5;
import javax.swing.JOptionPane;
public class F5 {
    public static void main(String[] args) {
       String a = JOptionPane.showInputDialog("INGRESA SI, NO O OTRA PALABRA");
        System.out.println(respuesta(a));
    }
    //FUNCION QUE VALIDA SI LA PALABRA INGRESA ES UN SI O NO, SI CUMPLE RETORNA "CORRECTO", NO CUMPLIR RETORNA "INCORRECTO"
    public static String respuesta(String r){
        if ("si".equals(r) || "no".equals(r)){
            r = "CORRECTO";
        }
        else{
            r = "INCORRECTO";
        }
        return r;
    }
}
