package ar.edu.unju.fi.ejercicio7main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7model.empleado;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----Ingresar datos para empleado----");
		System.out.println("Nombre del empleado: ");
		String nombre = scanner.nextLine();
		System.out.println("Legajo del nuevo empleado: ");
		int legajo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Introduzca salario: ");
		float salario = scanner.nextFloat();
		empleado empleado = new empleado(nombre, legajo, salario);
		empleado.mostrarDatos();
		
		
		
	}
	
	
}