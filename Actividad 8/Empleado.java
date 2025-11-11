// actividad 8
public class Empleado extends Persona {
    protected int anoIncorporacion;
    protected String numeroDespacho;

    public Empleado(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                    int anoIncorporacion, String numeroDespacho) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    // Getter y Setter
    public int getAnoIncorporacion() {
        return anoIncorporacion;
    }

    public void setAnoIncorporacion(int anoIncorporacion) {
        this.anoIncorporacion = anoIncorporacion;
    }

    public String getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(String numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    // Método específico
    public void reasignarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Año de incorporación: " + anoIncorporacion + "\n" +
               "Número de despacho: " + numeroDespacho;
    }
}