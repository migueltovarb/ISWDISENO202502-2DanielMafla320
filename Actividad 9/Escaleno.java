// actividad 9
public class Escaleno extends TrianguloBase {
    private int lado1;
    private int lado2;
    private int lado3;

    // Constructor
    public Escaleno(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Método para calcular el perímetro
    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    // Representación en texto del triángulo
    @Override
    public String toString() {
        return "Triángulo Escaleno\n" +
               "Lados: " + lado1 + ", " + lado2 + ", " + lado3 + "\n" +
               "Perímetro: " + perimetro();
    }
}
