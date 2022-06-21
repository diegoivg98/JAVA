package switchcase;
public class Switchcase {
    public static void main(String[] args) {
        String estacion="asasas";
        
          switch (estacion){
          //distintos case para las cuatro estaciones del año
            case "otoño" -> {
                System.out.println("estacion Otoño");
            }
            case "invierno" -> {
                System.out.println("estacion Invierno");
            }
            case "primavera" -> {
                System.out.println("estacion Primavera");
            }
            case "verano" -> {
                System.out.println("estacion Verano");
            }
            default -> {
                    System.out.println("no es una estación");
                    }
          }
    }    
}