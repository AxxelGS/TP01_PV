package ar.edu.unju.fi.ejercicio6main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6model.persona;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		

		persona U1 = new persona();
		System.out.println("Creacion de Usuario \"U\"  ");
		U1.mostrarDatos();
		
		System.out.println("Ingresar Datos: ");
		System.out.println("DNI: ");
		String dni = scanner.nextLine();	
		System.out.println("Nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Fecha de Nacimiento (../../....) ");
		LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine(),formatoFecha);
		persona U2 = new persona(dni, nombre, fechaNacimiento);
		U2.mostrarDatos();
		
		persona U3 = new persona();
		System.out.println("ingrese sus datos ");
		System.out.println("DNI: ");
		U3.setDni(scanner.nextLine()); 	
		System.out.println("Nombre: ");
		U3.setNombre(scanner.nextLine());
		System.out.println("Fecha de Nacimiento (../../....): ");
		LocalDate fechaNacimiento2 = LocalDate.parse(scanner.nextLine(),formatoFecha);
		U3.setFechaNac(fechaNacimiento2);
		System.out.println("Provincia: ");
		U3.setProvincia(scanner.nextLine());
		U3.mostrarDatos();				
	}
}