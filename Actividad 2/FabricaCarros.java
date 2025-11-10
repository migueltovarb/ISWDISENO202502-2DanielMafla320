
public class FabricaCarros {
    public static void main(String[] args) {


        System.out.println("=== Planta Norte ===");
        for (int i = 1; i <= 5; i++) { 
            String llantas = "Tamaño: 18 pulgadas, Tipo: Deportivas";
            String chasis = "Peso: 900 kg, Material: Aluminio";
            String color = obtenerColorPlantaNorte(i);
            System.out.println("Carro #" + i + " -> " + llantas + " | " + chasis + " | Color: " + color);
        }

        System.out.println();


        System.out.println("=== Planta Sur ===");
        for (int i = 1; i <= 5; i++) {
            String llantas = "Tamaño: 16 pulgadas, Tipo: TodoTerreno";
            String chasis = "Peso: 1200 kg, Material: Acero";
            String color = obtenerColorPlantaSur(i);
            System.out.println("Carro #" + i + " -> " + llantas + " | " + chasis + " | Color: " + color);
        }
    }


    public static String obtenerColorPlantaNorte(int n) {
        String[] colores = {"Rojo", "Negro", "Blanco"};
        return colores[n % colores.length];
    }


    public static String obtenerColorPlantaSur(int n) {
        String[] colores = {"Azul", "Gris", "Verde"};
        return colores[n % colores.length];
    }
}
