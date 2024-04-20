package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número en el rango [5,10]
        int n;
        do {
            System.out.print("Ingrese un número entero en el rango [5,10]: ");
            n = scanner.nextInt();
        } while (n < 5 || n > 10);

        // Crear un array de tipo String de tamaño n según el número ingresado por el usuario
        String[] nombres = new String[n];

        // Solicitar al usuario que ingrese nombres para cada posición del array
        for (int i = 0; i < nombres.length; i++) {
            scanner.nextLine();
            System.out.print("Ingrese un nombre para la posición " + i + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar el valor de cada posición del array (comenzando desde el primer índice 0)
        System.out.println("\nValores del array (comenzando desde el primer índice 0):");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        // Mostrar el contenido del array comenzando con la última posición
        System.out.println("\nContenido del array (comenzando con la última posición):");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        scanner.close();
    }
}