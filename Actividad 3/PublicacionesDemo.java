// Actividad 3
import java.util.Scanner;

public class PublicacionesDemo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ingreso de datos para el libro
        System.out.println("=== Registro de Libro ===");
        System.out.print("Ingrese el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.print("Ingrese el costo: ");
        float costoLibro = entrada.nextFloat();
        System.out.print("Cantidad de páginas: ");
        int paginas = entrada.nextInt();
        System.out.print("Año de lanzamiento: ");
        int anioLanzamiento = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        Libro libro = new Libro(nombreLibro, costoLibro, paginas, anioLanzamiento);

        // Ingreso de datos para el disco
        System.out.println("\n=== Registro de Disco ===");
        System.out.print("Ingrese el nombre del disco: ");
        String nombreDisco = entrada.nextLine();
        System.out.print("Ingrese el costo: ");
        float costoDisco = entrada.nextFloat();
        System.out.print("Duración total (en minutos): ");
        float duracion = entrada.nextFloat();

        Disco disco = new Disco(nombreDisco, costoDisco, duracion);

        // Mostrar resultados
        System.out.println("\n*** Detalles del Libro ***");
        libro.mostrar();

        System.out.println("\n*** Detalles del Disco ***");
        disco.mostrar();

        entrada.close();
    }
}
