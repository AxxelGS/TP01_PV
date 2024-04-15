package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El triple del número es: " + (numero * 3));
        } else {
            System.out.println("El doble del número es: " + (numero * 2));
        }
        
        scanner.close();
    }
}