public class Quadrado extends ObjetoGeometrico {
    private double lado;

    public Quadrado(double l) {
        lado = l;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getPerimetro() {
        return 4 * lado;
    }
}
