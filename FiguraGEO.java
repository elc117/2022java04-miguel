import java.io.*;

public class FiguraGEO 
{
    protected String aresta;

    public FiguraGEO(String aresta)
    {
        this.aresta = aresta;
    }
    
    public void VerificarArestas(String aresta)
    {
        if(this.aresta == aresta)
        {
            System.out.println("figura confere");
        }
        else
        {
            System.out.println("não confere"); 
        }
    }
}
