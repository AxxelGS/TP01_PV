package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número entero [0,10]: ");
        int numero = scanner.nextInt();
        int factorial = 1;

        // Validar rango del número
        if (numero >= 0 && numero <= 10) {
            int i = 1;
            while (i <= numero) {
                factorial *= i;
                i++;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        } else {
            System.out.println("Número fuera del rango permitido.");
        }
        
        scanner.close();
    }
}