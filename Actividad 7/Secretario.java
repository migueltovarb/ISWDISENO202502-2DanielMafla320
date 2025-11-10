// actividad 7
public class Secretario extends Empleado {
    private String oficina;
    private String fax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono,
                      double salario, String oficina, String fax) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.oficina = oficina;
        this.fax = fax;
    }

    @Override
    public void incrementarSalario() {
        this.salario *= 1.05; // Aumento del 5% anual
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Cargo: Secretario\n" +
                "Oficina asignada: " + oficina + "\n" +
                "Fax de contacto: " + fax;
    }
}
