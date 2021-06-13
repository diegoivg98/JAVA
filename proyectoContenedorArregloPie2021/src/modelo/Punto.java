package modelo;
public class Punto {
    private int coordX;
    private int coordY;
    public Punto(int cx, int cy){
        this.setCoordX(cx);
        this.setCoordY(cy);
    }
    public int getCoordX() {
        return coordX;
    }
    private void setCoordX(int coordX) {
        this.coordX = coordX;
    }
    public int getCoordY() {
        return coordY;
    }
    private void setCoordY(int coordY) {
        this.coordY = coordY;
    }
}
