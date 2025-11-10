// actividad 6
public class Remolque {
    private int capacidadPeso;

    public Remolque(int capacidadPeso) {
        this.capacidadPeso = capacidadPeso;
    }

    @Override
    public String toString() {
        return "Remolque con capacidad de carga: " + capacidadPeso + " kg";
    }
}
