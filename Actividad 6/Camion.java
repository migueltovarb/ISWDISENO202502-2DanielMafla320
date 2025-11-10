// actividad 6
public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public void agregarRemolque(Remolque nuevoRemolque) {
        this.remolque = nuevoRemolque;
    }

    public void retirarRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int incremento) {
        if (remolque != null && velocidad + incremento > 100) {
            System.out.println("Advertencia: el camión está excediendo la velocidad permitida con remolque.");
        } else {
            super.acelerar(incremento);
        }
    }

    @Override
    public String toString() {
        String descripcion = super.toString();
        if (remolque != null) {
            descripcion += " | " + remolque.toString();
        }
        return descripcion;
    }
}
