
import java.util.ArrayList;
import java.util.List;
public class testeFormas {
    public static void main(String[] args) {
        List<FormaBidimencional> formas2D = new ArrayList<>();
        formas2D.add(new Quadrado(5));
        formas2D.add(new Retangulo(4,6));
        formas2D.add(new Circulo (3));

        List<FormaTridimensional> formas3D = new ArrayList<>();
        formas3D.add(new Cubo(4));
    
    System.out.println("--- formas Bidimensionais ---");
    for (FormaBidimencional forma : formas2D){
        System.out.println("Forma: " + forma.getNome());
        System.out.printf("Area: %.2f",forma.calcularArea());
        System.out.printf("Perimetro: %.2f", forma.calcularPerimetro());
    }

    System.out.println("--- formas Tridimensionais ---");
    for (FormaTridimensional forma : formas3D){
        System.out.println("Forma:" + forma.getNome());
        System.out.printf("Area: %.2f", forma.calcularArea());
        System.out.printf("Volume: %.2f", forma.calcularVolume());
        }
    }
}
