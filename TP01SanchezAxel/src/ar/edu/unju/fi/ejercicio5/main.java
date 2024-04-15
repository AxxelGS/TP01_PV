package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero entre [1,9]: ");
        int numero = scanner.nextInt();

        // Validar que el número esté en el rango correcto
        if (numero < 1 || numero > 9) {
            System.out.println("El número ingresado no está en el rango [1,9].");
            return;
        }

        // Mostrar la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        scanner.close();
    }
}