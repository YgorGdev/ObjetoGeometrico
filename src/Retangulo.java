public class Retangulo extends ObjetoGeometrico {
    private double comprimento;
    private double altura;

    public Retangulo(double c, double a) {
        comprimento = c;
        altura = a;
    }

    public double getArea() {
        return comprimento * altura;
    }

    public double getPerimetro() {
        return 2 * (comprimento + altura);
    }
}
