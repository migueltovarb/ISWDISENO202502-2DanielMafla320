// actividad 8
public class Persona {
    protected String nombre;
    protected String apellidos;
    protected String numeroIdentificacion;
    protected String estadoCivil;

    // Constructor
    public Persona(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    // Método para cambiar el estado civil
    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellidos + "\n" +
               "Número de Identificación: " + numeroIdentificacion + "\n" +
               "Estado Civil: " + estadoCivil;
    }
}
