// Actividad 3
public class Publicacion {
    protected String nombre;
    protected float costo;

    public Publicacion(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public void mostrar() {
        System.out.println("Nombre de la publicación: " + nombre);
        System.out.println("Costo: $" + costo);
    }
}
