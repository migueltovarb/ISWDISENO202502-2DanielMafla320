// actividad 6
public class VehiculosDemo {
    public static void main(String[] args) {
        // Crear un coche
        Coche auto = new Coche("ABC123", 4);
        System.out.println("Coche registrado: " + auto.toString());
        System.out.println("Puertas del coche: " + auto.getNumeroPuertas());

        // Acelerar el coche
        auto.acelerar(50);
        System.out.println("Tras acelerar: " + auto.toString());

        // Crear un camión
        Camion camion = new Camion("XYZ789");
        System.out.println("\nCamión registrado: " + camion.toString());

        // Acelerar camión sin remolque
        camion.acelerar(80);
        System.out.println("Velocidad actual: " + camion.toString());

        // Asignar un remolque
        Remolque trailer = new Remolque(2000);
        camion.agregarRemolque(trailer);
        System.out.println("Camión con remolque: " + camion.toString());

        // Intentar exceder la velocidad
        camion.acelerar(30); // Debería advertir exceso de velocidad

        // Acelerar dentro del límite permitido
        camion.acelerar(10);
        System.out.println("Aceleración dentro del límite: " + camion.toString());

        // Retirar el remolque
        camion.retirarRemolque();
        System.out.println("Camión sin remolque: " + camion.toString());

        // Acelerar nuevamente sin restricciones
        camion.acelerar(50);
        System.out.println("Tras quitar el remolque y acelerar: " + camion.toString());
    }
}
