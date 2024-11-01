public class QuadroNegro {
    private Quadrado quadrado;
    private Retangulo retangulo;
    private Circunferencia circunferencia;
    private Triangulo triangulo;

    public void limpaQuadro() {
        quadrado = null;
        retangulo = null;
        circunferencia = null;
        triangulo = null;
    }

    public void criaQuadrado(double l) {
        quadrado = new Quadrado(l);
    }

    public void criaRetangulo(double c, double a) {
        retangulo = new Retangulo(c, a);
    }

    public void criaCircunferencia(double r) {
        circunferencia = new Circunferencia(r);
    }

    public void criaTriangulo(double b, double a) {
        triangulo = new Triangulo(b, a);
    }

    public void mostraAreaObjetos() {
        if (quadrado != null) {
            System.out.println("Quadrado. Área: " + quadrado.getArea());
        }
        if (retangulo != null) {
            System.out.println("Retângulo. Área: " + retangulo.getArea());
        }
        if (triangulo != null) {
            System.out.println("Triângulo. Área: " + triangulo.getArea());
        }
        if (circunferencia != null) {
            System.out.println("Circunferência. Área: " + circunferencia.getArea());
        }
    }

    public void mostraPerimetroObjetos() {
        if (quadrado != null) {
            System.out.println("Quadrado. Perímetro: " + quadrado.getPerimetro());
        }
        if (retangulo != null) {
            System.out.println("Retângulo. Perímetro: " + retangulo.getPerimetro());
        }
        if (triangulo != null) {
            System.out.println("Triângulo. Perímetro: " + triangulo.getPerimetro());
        }
        if (circunferencia != null) {
            System.out.println("Circunferência. Perímetro: " + circunferencia.getPerimetro());
        }
    }
}
