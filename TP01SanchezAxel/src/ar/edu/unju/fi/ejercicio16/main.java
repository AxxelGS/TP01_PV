package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir y crear un array para almacenar 5 elementos de tipo String
        String[] nombres = new String[5];

        // Pedir al usuario que ingrese los nombres usando una estructura de control for
        System.out.println("Ingrese 5 nombres de personas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre en la posición " + i + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar los valores guardados en el array usando una estructura de control while
        System.out.println("\nValores guardados en el array:");
        int index = 0;
        while (index < nombres.length) {
            System.out.println(nombres[index]);
            index++;
        }

        // Mostrar el tamaño del array usando length
        System.out.println("\nTamaño del array: " + nombres.length);

        // Solicitar al usuario que ingrese el índice de un elemento a eliminar del array
        byte indiceAEliminar;
        do {
            System.out.print("Ingrese el índice del elemento a eliminar (0-4): ");
            indiceAEliminar = scanner.nextByte();
        } while (indiceAEliminar < 0 || indiceAEliminar >= nombres.length);

        // Eliminar el elemento del array y realizar desplazamientos si es necesario
        for (int i = indiceAEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = ""; // Asignar espacio en blanco al último elemento eliminado

        // Mostrar el arreglo nuevamente
        System.out.println("\nArreglo después de eliminar el elemento en el índice " + indiceAEliminar + ":");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        scanner.close();
    }
}