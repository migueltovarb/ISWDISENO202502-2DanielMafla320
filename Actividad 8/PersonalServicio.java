// actividad 8
public class PersonalServicio extends Empleado {
    private String seccion;

    // Constructor
    public PersonalServicio(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                            int anoIncorporacion, String numeroDespacho, String seccion) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anoIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    // Método para trasladar a nueva sección
    public void trasladarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tipo: Personal de Servicio\n" +
               "Sección: " + seccion;
    }
}
