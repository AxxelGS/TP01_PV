package ar.edu.unju.fi.ejercicio17main;

import ar.edu.unju.fi.ejercicio17model.Jugador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        while (true) {
            mostrarMenu();
            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: ingrese un número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    altaJugador(scanner, jugadores);
                    break;
                case 2:
                    mostrarDatosJugador(scanner, jugadores);
                    break;
                case 3:
                    mostrarJugadoresOrdenados(jugadores);
                    break;
                case 4:
                    modificarDatosJugador(scanner, jugadores);
                    break;
                case 5:
                    eliminarJugador(scanner, jugadores);
                    break;
                case 6:
                    mostrarCantidadTotalJugadores(jugadores);
                    break;
                case 7:
                    mostrarCantidadJugadoresNacionalidad(scanner, jugadores);
                    break;
                case 8:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1 - Alta de jugador");
        System.out.println("2 - Mostrar los datos del jugador");
        System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
        System.out.println("4 - Modificar los datos de un jugador");
        System.out.println("5 - Eliminar un jugador");
        System.out.println("6 - Mostrar la cantidad total de jugadores");
        System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
        System.out.println("8 - Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static void altaJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (formato dd/MM/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);

        System.out.print("Ingrese la nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.print("Ingrese la estatura (en metros): ");
        double estatura = scanner.nextDouble();

        System.out.print("Ingrese el peso (en kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Consume la nueva línea después de leer el double

        System.out.print("Ingrese la posición (delantero, medio, defensa, arquero): ");
        String posicion = scanner.nextLine();

        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
        jugadores.add(jugador);
        System.out.println("Jugador agregado correctamente.");
    }

    private static void mostrarDatosJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.nextLine();

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Datos del jugador:");
                System.out.println(jugador);
                return;
            }
        }
        System.out.println("Jugador no encontrado.");
    }

    private static void mostrarJugadoresOrdenados(ArrayList<Jugador> jugadores) {
        ArrayList<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
        jugadoresOrdenados.sort((j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));

        System.out.println("Jugadores ordenados por apellido:");
        for (Jugador jugador : jugadoresOrdenados) {
            System.out.println(jugador);
        }
    }

    private static void modificarDatosJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese el nombre del jugador a modificar: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del jugador a modificar: ");
        String apellido = scanner.nextLine();

        Iterator<Jugador> iterator = jugadores.iterator();
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                altaJugador(scanner, jugadores);
                iterator.remove();
                System.out.println("Datos del jugador actualizados.");
                return;
            }
        }
        System.out.println("Jugador no encontrado para modificar.");
    }

    private static void eliminarJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese el nombre del jugador a eliminar: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del jugador a eliminar: ");
        String apellido = scanner.nextLine();

        Iterator<Jugador> iterator = jugadores.iterator();
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                iterator.remove();
                System.out.println("Jugador eliminado correctamente.");
                return;
            }
        }
        System.out.println("Jugador no encontrado para eliminar.");
    }

    private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
        System.out.println("Cantidad total de jugadores: " + jugadores.size());
    }

    private static void mostrarCantidadJugadoresNacionalidad(Scanner scanner, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese la nacionalidad para contar jugadores: ");
        String nacionalidad = scanner.nextLine();

        long cantidad = jugadores.stream().filter(jugador -> jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)).count();
        System.out.println("Cantidad de jugadores de nacionalidad " + nacionalidad + ": " + cantidad);
    }
}