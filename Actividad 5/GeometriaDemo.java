
public class GeometriaDemo {
    public static void main(String[] args) {

        System.out.println("=== DATOS DEL CÍRCULO ===");
        Circulo circulo = new Circulo();
        circulo.ingresarRadio();
        circulo.mostrar();

        System.out.println("\n=== DATOS DEL CILINDRO ===");
        Cilindro cilindro = new Cilindro();
        cilindro.ingresarRadio();
        cilindro.ingresarAltura();
        cilindro.mostrar();

        System.out.println("\n=== DATOS DEL CILINDRO HUECO ===");
        CilindroHueco cilindroHueco = new CilindroHueco();
        cilindroHueco.ingresarRadio();
        cilindroHueco.ingresarAltura();
        cilindroHueco.ingresarRadioInterno();
        cilindroHueco.mostrar();
    }
}
