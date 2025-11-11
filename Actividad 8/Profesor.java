// actividad 8
public class Profesor extends Empleado {
    private String departamento;

    // Constructor
    public Profesor(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                    int anoIncorporacion, String numeroDespacho, String departamento) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anoIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    // Método para cambiar de departamento
    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tipo: Profesor\n" +
               "Departamento: " + departamento;
    }
}
