// actividad 7
public class EmpleadosDemo {
    public static void main(String[] args) {
        // Crear los distintos empleados
        Secretario secretario = new Secretario("Ana", "García", "12345678A", "Av. Principal 10", "600000001", 20000, "Oficina A", "912345678");
        Vendedor vendedor = new Vendedor("Carlos", "López", "87654321B", "Calle Secundaria 22", "600000002", 18000,
                                         "ABC123", "Toyota", "Corolla", "611111111", "Madrid", 5.0);
        JefeZona jefe = new JefeZona("María", "Rodríguez", "11223344C", "Paseo del Sol 5", "600000003", 35000,
                                     "Oficina Central", "XYZ789", "BMW", "Serie 3");

        // Asignaciones iniciales
        vendedor.cambiarSupervisor(jefe);
        jefe.cambiarSecretario(secretario);
        jefe.darAltaVendedor(vendedor);

        // Mostrar información inicial
        System.out.println("=== DATOS INICIALES ===");
        System.out.println(secretario);
        System.out.println("\n" + vendedor);
        System.out.println("\n" + jefe);

        // Incremento de salarios
        System.out.println("\n=== AUMENTO DE SUELDOS ===");
        secretario.incrementarSalario();
        vendedor.incrementarSalario();
        jefe.incrementarSalario();

        System.out.println("Nuevo salario del secretario: " + secretario.salario);
        System.out.println("Nuevo salario del vendedor: " + vendedor.salario);
        System.out.println("Nuevo salario del jefe: " + jefe.salario);

        // Operaciones del vendedor
        System.out.println("\n=== GESTIÓN DE CLIENTES ===");
        vendedor.darAltaCliente("Cliente A");
        vendedor.darAltaCliente("Cliente B");
        System.out.println("Listado actual de clientes: " + vendedor);

        vendedor.darBajaCliente("Cliente A");
        System.out.println("Después de eliminar un cliente: " + vendedor);

        vendedor.cambiarCoche("DEF456", "Honda", "Civic");
        System.out.println("Vehículo actualizado del vendedor: " + vendedor);
    }
}
