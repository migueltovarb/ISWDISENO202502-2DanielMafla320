// actividad 7
public class Empleado {
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String direccion;
    protected int aniosAntiguedad;
    protected String telefono;
    protected double salario;
    protected Empleado supervisor;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.aniosAntiguedad = 0;
        this.supervisor = null;
    }

    // Permite establecer o cambiar el supervisor del empleado
    public void cambiarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    // Método genérico, redefinido en las subclases según el puesto
    public void incrementarSalario() {
        this.salario *= 1.0; // Sin incremento por defecto
    }

    @Override
    public String toString() {
        String nombreSupervisor = (supervisor != null)
                ? supervisor.nombre + " " + supervisor.apellidos
                : "Sin asignar";

        return "Empleado: " + nombre + " " + apellidos + "\n" +
               "DNI: " + dni + "\n" +
               "Dirección: " + direccion + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Años de antigüedad: " + aniosAntiguedad + "\n" +
               "Salario actual: " + salario + " €\n" +
               "Supervisor: " + nombreSupervisor;
    }
}
