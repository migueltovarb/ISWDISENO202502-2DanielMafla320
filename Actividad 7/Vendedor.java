// actividad 7
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado {
    private String placaCoche;
    private String marcaCoche;
    private String modeloCoche;
    private String telefonoPersonal;
    private String zonaVenta;
    private List<String> clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario,
                    String placaCoche, String marcaCoche, String modeloCoche, String telefonoPersonal,
                    String zonaVenta, double comision) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.placaCoche = placaCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
        this.telefonoPersonal = telefonoPersonal;
        this.zonaVenta = zonaVenta;
        this.comision = comision;
        this.clientes = new ArrayList<>();
    }

    @Override
    public void incrementarSalario() {
        this.salario *= 1.10; // Aumento del 10% anual
    }

    public void agregarCliente(String cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(String cliente) {
        clientes.remove(cliente);
    }

    public void actualizarCoche(String placa, String marca, String modelo) {
        this.placaCoche = placa;
        this.marcaCoche = marca;
        this.modeloCoche = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Cargo: Vendedor\n" +
                "Vehículo asignado: " + marcaCoche + " " + modeloCoche + " (Placa: " + placaCoche + ")\n" +
                "Teléfono de contacto: " + telefonoPersonal + "\n" +
                "Zona de ventas: " + zonaVenta + "\n" +
                "Comisión: " + comision + "%\n" +
                "Clientes asignados: " + clientes;
    }
}
