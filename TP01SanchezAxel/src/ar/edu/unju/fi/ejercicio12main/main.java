package ar.edu.unju.fi.ejercicio12main;

import ar.edu.unju.fi.ejercicio12model.Persona;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();

        String[] fechaNacimientoArray = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(fechaNacimientoArray[0]);
        int mes = Integer.parseInt(fechaNacimientoArray[1]) - 1; // Se resta 1 porque en Calendar los meses van de 0 a 11
        int anio = Integer.parseInt(fechaNacimientoArray[2]);

        Calendar fechaNacimiento = new GregorianCalendar(anio, mes, dia);
        Persona persona = new Persona(nombre, fechaNacimiento);

        System.out.println("\nDatos de la persona:");
        System.out.println(persona);
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiaco());
        System.out.println("Estación: " + persona.obtenerEstacion());

        scanner.close();
    }
}