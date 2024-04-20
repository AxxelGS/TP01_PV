package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Ingrese un número entero en el rango [3,10]: ");
            n = scanner.nextInt();
        } while (n < 3 || n > 10);

        // Crear un array de tamaño n según el número ingresado por el usuario
        int[] numeros = new int[n];

        // Solicitar valores para el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el valor de cada posición del array
        System.out.println("\nValores del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // Suma de todos los valores del array
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("La suma de todos los valores es: " + suma);

        scanner.close();
    }
}