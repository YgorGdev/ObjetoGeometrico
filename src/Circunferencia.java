public class Circunferencia extends ObjetoGeometrico {
    private double pi = Math.PI; // Usando Math.PI para maior precisão
    private double raio;

    public Circunferencia(double r) {
        raio = r;
    }

    public double getArea() {
        return pi * (raio * raio);
    }

    public double getPerimetro() {
        return 2 * pi * raio;
    }
}
