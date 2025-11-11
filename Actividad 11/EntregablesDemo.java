// actividad 11
public class EntregablesDemo {
    public static void main(String[] args) {
        // Crear series
        Serie serie1 = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
        Serie serie2 = new Serie("The Office", 9, "Comedia", "Greg Daniels");

        // Crear videojuegos
        Videojuego juego1 = new Videojuego("The Witcher 3", 200, "RPG", "CD Projekt");
        Videojuego juego2 = new Videojuego("FIFA 2023", 50, "Deportes", "EA Sports");

        // ===== SERIES =====
        System.out.println("=== SERIES ===");
        System.out.println("Serie 1:\n" + serie1);
        System.out.println("Serie 2:\n" + serie2);

        // Entregar y devolver
        serie1.entregar();
        System.out.println("¿Serie 1 entregada?: " + serie1.isEntregado());

        serie1.devolver();
        System.out.println("¿Serie 1 devuelta?: " + serie1.isEntregado());

        // Comparación por número de temporadas
        System.out.println("Comparación de series (por temporadas): " + serie1.compareTo(serie2));

        // ===== VIDEOJUEGOS =====
        System.out.println("\n=== VIDEOJUEGOS ===");
        System.out.println("Juego 1:\n" + juego1);
        System.out.println("Juego 2:\n" + juego2);

        // Entregar y comprobar estado
        juego2.entregar();
        System.out.println("¿Juego 2 entregado?: " + juego2.isEntregado());

        // Comparación por horas estimadas
        System.out.println("Comparación de videojuegos (por horas estimadas): " + juego1.compareTo(juego2));
    }
}
