// actividad 9
public abstract class TrianguloBase {

    // Método abstracto para calcular el perímetro
    public abstract double perimetro();

    // Calcula el área a partir de un lado y la hipotenusa usando Pitágoras
    public double calcularAreaConHipotenusa(int base, int hipotenusa) {
        // Aplicando el teorema de Pitágoras: base² + altura² = hipotenusa²
        // Área = (base * altura) / 2
        double altura = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(base, 2));
        return (base * altura) / 2;
    }
}
