public abstract class FormaGeometrica{
    protected String nome;
    public FormaGeometrica(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public abstract  double calcularArea();
    
}