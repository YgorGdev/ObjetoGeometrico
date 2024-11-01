public class Triangulo extends ObjetoGeometrico {
    private double base;
    private double altura;

    public Triangulo(double b, double a) {
        base = b;
        altura = a;
    }

    public double getArea() {
        return (base * altura) / 2;
    }

    public double getPerimetro() {
        // Supondo que seja um triângulo isósceles para simplificação
        double lado = Math.sqrt((base / 2) * (base / 2) + altura * altura);
        return 2 * lado + base;
    }
}
