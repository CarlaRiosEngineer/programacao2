public class Circulo extends FormaBidimencional {
    private double raio;
    public Circulo(double raio){
        super("Circulo");
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * raio *raio;
    }
    @Override
    public double calcularPerimetro(){
        return Math.PI * 2 * raio;
    }
}
