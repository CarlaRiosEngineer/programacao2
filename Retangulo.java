public class Retangulo extends FormaBidimencional {
    private double altura;
    private double largura;

    public Retangulo(double altura , double largura){
        super("Retangulo");
        this.altura = altura;
        this.largura = largura;
    }
    @Override
    public double calcularArea(){
        return largura * altura;
    }
    @Override
    public double calcularPerimetro(){
        return 2 * (largura + altura);
    }
}
