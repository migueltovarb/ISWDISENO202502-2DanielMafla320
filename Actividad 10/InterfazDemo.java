// actividad 10
import java.util.Scanner;

public class InterfazDemo {
    public static void main(String[] args) {
        // Crear un auto con 0 unidades de gasolina
        Auto auto = new Auto(0);
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de gasolina para tanquear
        System.out.print("Ingrese la cantidad de gasolina para tanquear: ");
        int cantidadGasolina = scanner.nextInt();

        // Retanquear el auto con la cantidad ingresada
        boolean resultado = auto.retanquear(cantidadGasolina);
        System.out.println("¿Se pudo retanquear? " + resultado);
        System.out.println("Gasolina actual: " + auto.getGasolina());

        // Intentar conducir después de repostar
        auto.conducir();

        scanner.close();
    }
}
