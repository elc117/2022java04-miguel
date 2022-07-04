public class Main {
    public static void main(String[] args) {
        Quadrado quad = new Quadrado("azul",4);
        Triangulo tri = new Triangulo("rosa",2,3);
        quad.VerificarArestas("3");
        quad.VerificarArestas("4");
        tri.VerificarArestas("2");
        tri.VerificarArestas("3");
        System.out.println(quad.getCor());
        System.out.println(quad.getVal());
        System.out.println(tri.getCor());
        System.out.println(tri.getVal());
    }
}
