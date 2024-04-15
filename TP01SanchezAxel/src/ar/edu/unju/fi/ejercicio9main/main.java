package ar.edu.unju.fi.ejercicio9main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9model.producto;
public class main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i=0;i<3;i++) { 
		producto producto = new producto() ;	
		System.out.println("Nombre del producto: ");
		producto.setNombre (scanner.nextLine());
		System.out.println("Codigo del producto: ");
		producto.setCodigo(scanner.nextInt());
		System.out.println("Precio del producto: ");
		producto.setPrecio(scanner.nextDouble());
		System.out.println("¿Tiene un descuento?Y/N ");
		String cad = scanner.next();
		char car = cad.charAt(0); 
		if (car=='y' || car == 'Y') {
			System.out.println("¿De cuanto es el descuento? (Del $1 al $50):");
			producto.setDescuento(scanner.nextInt());
			}	
		scanner.nextLine();
		producto.mostrarDatos();
		}
	}
		
}