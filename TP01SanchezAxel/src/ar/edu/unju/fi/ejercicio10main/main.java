package ar.edu.unju.fi.ejercicio10main;

import ar.edu.unju.fi.ejercicio10model.Pizza;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("** Pizza " + i + " **");
            System.out.print("Ingrese el diámetro (20, 30, o 40): ");
            int diametro = scanner.nextInt();
            System.out.print("¿Lleva ingredientes especiales? (true/false): ");
            boolean ingredientesEspeciales = scanner.nextBoolean();

            Pizza pizza = new Pizza(diametro, ingredientesEspeciales);

            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea());
        }

        scanner.close();
    }
}