// actividad 10

// La interfaz define el contrato para cualquier clase que realice conversiones de divisa.
public interface ConversorDivisa {
    double convertir(Double cantidad);
}

// Implementación específica: convierte de Euros a Dólares.
public class EuroDolarConversorDivisa implements ConversorDivisa {

    @Override
    public double convertir(Double cantidad) {
        // Tasa de cambio fija: 1 euro = 1.50 dólares
        return cantidad * 1.50;
    }

    @Override
    public String toString() {
        return "Conversor de Euros a Dólares";
    }
}

// Nota: las interfaces deben ser públicas si serán implementadas por clases fuera de su archivo.
