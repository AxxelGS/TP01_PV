package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[8]; // Array de 8 elementos
        
        // Solicitar al usuario que ingrese los valores para cada posición del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Mostrar por consola el índice y el valor almacenado en esa posición
        System.out.println("\nElementos del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice: " + i + ", Valor: " + numeros[i]);
        }
        
        scanner.close();
    }
}