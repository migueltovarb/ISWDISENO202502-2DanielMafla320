package inventarioSupermercado;

import java.util.Scanner;

public class InventarioSupermercado {

	public static void main(String[] args) {
		final int MAX_PRODUCTOS = 5;
		Scanner scanner = new Scanner(System.in);
		
		
		String[] nombresProductos = new String [MAX_PRODUCTOS];
		int [] cantidadesDisponibles = new int [30];
		
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Ingrese el nombre del producto");
			String  producto = scanner.next();
			nombresProductos[i] = producto;
			System.out.println("Ingrese la cantidad del producto");
			int cantidad = scanner.nextInt();
			cantidadesDisponibles[i] = cantidad; 
		}
		
		
		System.out.println("1. Mostrar todos los productos y sus existencias");
		System.out.println("2. Buscar un producto por nombre y ver su cantidad");
		System.out.println("3. Actualizar el inventario ( aumentar o disminuir stock con validaciones");
		System.out.println("4. Generar alerta de productos con cantidad menor a 10");
		System.out.println("5. salir");
		
		int respuesta = scanner.nextInt();
		switch(respuesta) {
		case 1:
			for( int i = 0; i < MAX_PRODUCTOS; i++) {
				System.out.println("Los productos disponibles son: "+ nombresProductos[i] + " y la cantidad disponible son: " + cantidadesDisponibles[i]);
			}
			break;
  		case 2:
  			System.out.println("Ingresa el nombre del producto a buscar");
  			String busqueda = scanner.next();
  			for (int i = 0; i <= nombresProductos.length; i++) {
  				if (busqueda == nombresProductos[i]) {
  					System.out.println("El producto se encuentra disponible y su cantidad de stock es: "+ cantidadesDisponibles[i]);
  				}
  				else {
  					System.out.println("El producto no se encuentra en la lista");
  				}
  			}	
  			break;
  			
  		case 3:
  			System.out.println("Ingresa el nombre del producto el cual deseas actualizar");
  			String busqueda2 = scanner.next();
  			for (int i = 0; i <= 4; i++) {
  				if (busqueda2 == nombresProductos[i]) {
  					System.out.println("Ingresa la cantidad del producto");
  					int cantidad2 = scanner.nextInt();
  					cantidadesDisponibles[i] = cantidad2;
  				}
  				else {
  					System.out.println("El producto no se encuentra disponible");
  				}
  			}
  			break;	
  				
  		case 4:
  			for (int i = 0; i <= 4; i++) {
  				if (cantidadesDisponibles[i] < 10) {
  					System.out.println("Advertencia," + nombresProductos[i] +   "tiene un cantidad baja de existencias:" + cantidadesDisponibles[i]);
  				}
  				break;
  			}
  			
  		case 5:
  			System.out.println("Que tengas buen dia");
  			break;
 
		}
	
		
	}

}
