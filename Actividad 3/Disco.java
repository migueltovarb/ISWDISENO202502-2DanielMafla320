// Actividad 3
public class Disco extends Publicacion {
    private float tiempoReproduccion;

    public Disco(String nombre, float costo, float tiempoReproduccion) {
        super(nombre, costo);
        this.tiempoReproduccion = tiempoReproduccion;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Tiempo total de reproducción: " + tiempoReproduccion + " minutos");
    }
}