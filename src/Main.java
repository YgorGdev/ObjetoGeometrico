public class Main {
    public static void main(String[] args) {
        QuadroNegro quadroNegro = new QuadroNegro();

        quadroNegro.criaQuadrado(10.6);
        quadroNegro.criaRetangulo(50.5, 20.4);
        quadroNegro.criaTriangulo(6.7, 5.5);
        quadroNegro.criaCircunferencia(10);

        quadroNegro.mostraAreaObjetos();
        quadroNegro.mostraPerimetroObjetos();
    }
}
