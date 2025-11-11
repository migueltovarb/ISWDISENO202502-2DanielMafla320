// actividad 10
import java.util.Scanner;

public class Auto implements IVehiculo {
    private int nivelGasolina;

    public Auto(int gasolinaInicial) {
        this.nivelGasolina = gasolinaInicial;
    }

    @Override
    public void conducir() {
        if (nivelGasolina > 0) {
            System.out.println("El auto está en marcha.");
        } else {
            System.out.println("No hay suficiente gasolina para conducir.");
        }
    }

    @Override
    public boolean retanquear(int cantidad) {
        nivelGasolina += cantidad;
        return true;
    }

    public int getNivelGasolina() {
        return nivelGasolina;
    }
}
