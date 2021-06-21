package f8;
import javax.swing.JOptionPane;
public class F8 {
    public static void main(String[] args) {
        double t = Double.parseDouble(JOptionPane.showInputDialog("INGRESA UNA CANTIDAD DE DOLARES"));
        double t1=temperatura((int) t,1);
        double t2=temperatura((int) t,2);
        System.out.println(t1+" °FARENHEIT");
        System.out.println(t2+" °KELVIN");
        
    }
    public static double temperatura(int x , int y){
        int res = 0;
        if (y==1) {
            res = (x * 9/5)+32;//FARENHEIT
        }else if (y==2) {
            res = (int) (x + 273.15);//KELVIN
        }
        return res;
    }
}