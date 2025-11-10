// ACTIVIDAD 4
public class DireccionDemo {
    public static void main(String[] args) {
        Direccion direccion = new Direccion();

        System.out.println("Por favor, ingrese los datos personales:");
        direccion.ingresarNombre();

        System.out.println("\nAhora introduzca los datos de la dirección:");
        direccion.ingresarDireccion();

        System.out.println("\n=== Datos completos del registro ===");
        direccion.mostrar();
    }
}
