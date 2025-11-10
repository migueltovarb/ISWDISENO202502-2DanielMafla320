// ACTIVIDAD 4
import java.util.Scanner;

public class Direccion extends Nombre {
    private String calle;
    private String ciudad;
    private String departamento;
    private String codigoPostal;

    public Direccion() {
        super();
        this.calle = "";
        this.ciudad = "";
        this.departamento = "";
        this.codigoPostal = "";
    }

    public void ingresarDireccion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Calle o avenida: ");
        this.calle = entrada.nextLine();
        System.out.print("Ciudad: ");
        this.ciudad = entrada.nextLine();
        System.out.print("Departamento o provincia: ");
        this.departamento = entrada.nextLine();
        System.out.print("Código postal: ");
        this.codigoPostal = entrada.nextLine();
    }

    public void ingresarNombre() {
        leerNombre();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Ubicación completa: " + calle + ", " + ciudad + ", " + departamento + ", CP " + codigoPostal);
    }
}
