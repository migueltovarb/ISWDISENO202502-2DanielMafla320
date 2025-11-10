// actividad 6
public class Coche extends Vehiculo {
    private int puertas;

    public Coche(String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    public int obtenerNumeroDePuertas() {
        return puertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + puertas;
    }
}
