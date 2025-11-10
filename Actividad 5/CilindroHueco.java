// actividad 5
import java.util.Scanner;

public class CilindroHueco extends Cilindro {
    private double radioInterior;

    public CilindroHueco() {
        super();
        this.radioInterior = 0.0;
    }

    public void ingresarRadioInterior() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio interior del cilindro hueco: ");
        this.radioInterior = sc.nextDouble();
    }

    public double calcularAreaHueca() {
        // Área lateral externa + área lateral interna + área de las bases externas - área de las bases internas
        double areaLateralExterior = 2 * Math.PI * radio * alturaCilindro;
        double areaLateralInterior = 2 * Math.PI * radioInterior * alturaCilindro;
        double areaBasesExterior = 2 * Math.PI * radio * radio;
        double areaBasesInterior = 2 * Math.PI * radioInterior * radioInterior;
        return areaLateralExterior + areaLateralInterior + areaBasesExterior - areaBasesInterior;
    }

    public double calcularVolumenHueco() {
        return Math.PI * (radio * radio - radioInterior * radioInterior) * alturaCilindro;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Radio interior: " + radioInterior);
        System.out.println("Área total del cilindro hueco: " + calcularAreaHueca());
        System.out.println("Volumen hueco: " + calcularVolumenHueco());
    }
}
