public class Triangulo extends FiguraGEO {
    private String cor;
    private int area;
    public Triangulo(String cor, int base, int altura){
        super("3");
        this.cor = cor;
        this.area = (base*altura)/2;
    }

    public String getCor() {
        return cor;
    }
    public int getVal() {
        return area;
    }
    
}
