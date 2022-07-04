public class Quadrado extends FiguraGEO {
    private String cor;
    private int area;
    public Quadrado(String cor, int aresta){
        super("4");
        this.cor = cor;
        this.area = aresta*aresta;
    }

    public String getCor() {
        return cor;
    }
    public int getVal() {
        return area;
    }
    
}

