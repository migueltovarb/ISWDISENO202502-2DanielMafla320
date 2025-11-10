// ACTIVIDAD 4 
import java.util.Scanner;

public class Nombre {
    protected String nombres;
    protected String apellidoPaterno;
    protected String apellidoMaterno;

    public Nombre() {
        this.nombres = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
    }

    public void ingresarNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba su(s) nombre(s): ");
        this.nombres = sc.nextLine();
        System.out.print("Escriba su primer apellido: ");
        this.apellidoPaterno = sc.nextLine();
        System.out.print("Escriba su segundo apellido: ");
        this.apellidoMaterno = sc.nextLine();
    }

    public void mostrar() {
        System.out.println("Nombre completo: " + nombres + " " + apellidoPaterno + " " + apellidoMaterno);
    }
}
