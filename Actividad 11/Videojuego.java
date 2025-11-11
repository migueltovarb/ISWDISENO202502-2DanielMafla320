// actividad 11
public class Videojuego implements Entregable {
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    // Constructor por defecto
    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    // Constructor con título y horas estimadas
    public Videojuego(String titulo, int horasEstimadas) {
        this();
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    // Constructor con todos los atributos excepto entregado
    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = false;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    // Métodos de la interfaz Entregable
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        if (a instanceof Videojuego) {
            Videojuego otro = (Videojuego) a;
            return Integer.compare(this.horasEstimadas, otro.horasEstimadas);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Videojuego:\n" +
               "Título: " + titulo + "\n" +
               "Horas estimadas: " + horasEstimadas + "\n" +
               "Entregado: " + entregado + "\n" +
               "Género: " + genero + "\n" +
               "Compañía: " + compania + "\n";
    }
}
