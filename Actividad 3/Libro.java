// Actividad 3
public class Libro extends Publicacion {
    private int paginasTotales;
    private int añoEdicion;

    public Libro(String nombre, float costo, int paginasTotales, int añoEdicion) {
        super(nombre, costo);
        this.paginasTotales = paginasTotales;
        this.añoEdicion = añoEdicion;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cantidad de páginas: " + paginasTotales);
        System.out.println("Año de edición: " + añoEdicion);
    }
}
