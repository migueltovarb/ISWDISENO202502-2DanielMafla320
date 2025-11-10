// actividad 6
public class Vehiculo {
    protected String placa;
    protected int velocidadActual;

    public Vehiculo(String placa) {
        this.placa = placa;
        this.velocidadActual = 0;
    }

    public void acelerar(int incremento) {
        this.velocidadActual += incremento;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Velocidad actual: " + velocidadActual + " km/h";
    }
}
