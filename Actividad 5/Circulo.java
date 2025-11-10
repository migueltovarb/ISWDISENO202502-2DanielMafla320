// actividad 5
import java.util.Scanner;

public class Circulo {
    protected double radio;

    public Circulo() {
        this.radio = 0.0;
    }

    public void ingresarRadio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio del círculo: ");
        this.radio = sc.nextDouble();
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void mostrar() {
        System.out.println("Radio del círculo: " + radio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
