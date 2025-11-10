// actividad 7
import java.util.ArrayList;
import java.util.List;

public class JefeZona extends Empleado {
    private String oficina;
    private Secretario asistente;
    private List<Vendedor> equipoVendedores;
    private String matriculaAuto;
    private String marcaAuto;
    private String modeloAuto;

    public JefeZona(String nombre, String apellidos, String dni, String direccion, String telefono, double salario,
                    String oficina, String matriculaAuto, String marcaAuto, String modeloAuto) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.oficina = oficina;
        this.asistente = null;
        this.equipoVendedores = new ArrayList<>();
        this.matriculaAuto = matriculaAuto;
        this.marcaAuto = marcaAuto;
        this.modeloAuto = modeloAuto;
    }

    @Override
    public void incrementarSalario() {
        this.salario *= 1.20; // Aumento del 20% anual
    }

    public void asignarSecretario(Secretario asistente) {
        this.asistente = asistente;
    }

    public void actualizarVehiculo(String matricula, String marca, String modelo) {
        this.matriculaAuto = matricula;
        this.marcaAuto = marca;
        this.modeloAuto = modelo;
    }

    public void agregarVendedor(Vendedor vendedor) {
        equipoVendedores.add(vendedor);
    }

    public void eliminarVendedor(Vendedor vendedor) {
        equipoVendedores.remove(vendedor);
    }

    @Override
    public String toString() {
        String nombreAsistente = (asistente != null)
                ? asistente.nombre + " " + asistente.apellidos
                : "No asignado";

        return super.toString() + "\n" +
                "Cargo: Jefe de Zona\n" +
                "Oficina: " + oficina + "\n" +
                "Secretario asignado: " + nombreAsistente + "\n" +
                "Vehículo: " + matriculaAuto + " " + marcaAuto + " " + modeloAuto + "\n" +
                "Cantidad de vendedores: " + equipoVendedores.size();
    }
}
