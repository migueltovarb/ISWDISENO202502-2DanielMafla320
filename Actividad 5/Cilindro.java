
import java.util.Scanner;

public class Cilindro extends Circulo {
    protected double alturaCilindro;

    public Cilindro() {
        super();
        this.alturaCilindro = 0.0;
    }

    public void ingresarAltura() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura del cilindro: ");
        this.alturaCilindro = sc.nextDouble();
    }

    public double calcularAreaTotal() {
        // Área lateral + área de las dos bases
        return (2 * Math.PI * radio * alturaCilindro) + (2 * area());
    }

    public double calcularVolumen() {
        return area() * alturaCilindro;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Altura del cilindro: " + alturaCilindro);
        System.out.println("Área total del cilindro: " + calcularAreaTotal());
        System.out.println("Volumen: " + calcularVolumen());
    }
}
