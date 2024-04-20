package ar.edu.unju.fi.ejercicio18main;

import ar.edu.unju.fi.ejercicio18model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18model.Pais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pais> paises = precargarPaises();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        while (true) {
            mostrarMenu();
            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: ingrese un número válido.");
                scanner.nextLine(); // Limpiar el buffer de entrada
                continue;
            }

            switch (opcion) {
                case 1:
                    altaDestinoTuristico(scanner, destinos, paises);
                    break;
                case 2:
                    mostrarDestinosTuristicos(destinos);
                    break;
                case 3:
                    modificarPaisDestinoTuristico(scanner, destinos, paises);
                    break;
                case 4:
                    destinos.clear();
                    System.out.println("Lista de destinos turísticos limpiada.");
                    break;
                case 5:
                    eliminarDestinoTuristico(scanner, destinos);
                    break;
                case 6:
                    mostrarDestinosOrdenados(destinos);
                    break;
                case 7:
                    mostrarTodosPaises(paises);
                    break;
                case 8:
                    mostrarDestinosPorPais(scanner, destinos);
                    break;
                case 9:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }

    private static ArrayList<Pais> precargarPaises() {
        ArrayList<Pais> paises = new ArrayList<>();
        paises.add(new Pais("001", "Argentina"));
        paises.add(new Pais("002", "Brasil"));
        paises.add(new Pais("003", "Chile"));
        // Agregar más países si es necesario
        return paises;
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1 - Alta de destino turístico");
        System.out.println("2 - Mostrar todos los destinos turísticos");
        System.out.println("3 - Modificar el país de un destino turístico");
        System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
        System.out.println("5 - Eliminar un destino turístico");
        System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
        System.out.println("7 - Mostrar todos los países");
        System.out.println("8 - Mostrar los destinos turísticos por país");
        System.out.println("9 - Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static void altaDestinoTuristico(Scanner scanner, ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
        System.out.print("Ingrese el código del destino turístico: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese el nombre del destino turístico: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del destino turístico: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el código del país asociado: ");
        String codigoPais = scanner.next();
        scanner.nextLine();

        Pais paisAsociado = buscarPaisPorCodigo(paises, codigoPais);
        if (paisAsociado == null) {
            System.out.println("Error: país no encontrado.");
            return;
        }

        System.out.print("Ingrese la cantidad de días: ");
        int cantidadDias = scanner.nextInt();
        scanner.nextLine();

        DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, paisAsociado, cantidadDias);
        destinos.add(destino);
        System.out.println("Destino turístico agregado correctamente.");
    }

    private static Pais buscarPaisPorCodigo(ArrayList<Pais> paises, String codigoPais) {
        for (Pais pais : paises) {
            if (pais.getCodigo().equalsIgnoreCase(codigoPais)) {
                return pais;
            }
        }
        return null;
    }

    private static void mostrarDestinosTuristicos(ArrayList<DestinoTuristico> destinos) {
        System.out.println("Lista de destinos turísticos:");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
    }

    private static void modificarPaisDestinoTuristico(Scanner scanner, ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
        System.out.print("Ingrese el código del destino turístico a modificar: ");
        String codigoDestino = scanner.nextLine();

        DestinoTuristico destino = buscarDestinoPorCodigo(destinos, codigoDestino);
        if (destino == null) {
            System.out.println("Error: destino turístico no encontrado.");
            return;
        }

        System.out.print("Ingrese el nuevo código del país asociado: ");
        String nuevoCodigoPais = scanner.next();
        scanner.nextLine();

        Pais nuevoPaisAsociado = buscarPaisPorCodigo(paises, nuevoCodigoPais);
        if (nuevoPaisAsociado == null) {
            System.out.println("Error: país no encontrado.");
            return;
        }

        destino.setPais(nuevoPaisAsociado);
        System.out.println("País del destino turístico modificado correctamente.");
    }

    private static DestinoTuristico buscarDestinoPorCodigo(ArrayList<DestinoTuristico> destinos, String codigoDestino) {
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
                return destino;
            }
        }
        return null;
    }

    private static void eliminarDestinoTuristico(Scanner scanner, ArrayList<DestinoTuristico> destinos) {
        System.out.print("Ingrese el código del destino turístico a eliminar: ");
        String codigoDestino = scanner.nextLine();

        Iterator<DestinoTuristico> iterator = destinos.iterator();
        while (iterator.hasNext()) {
            DestinoTuristico destino = iterator.next();
            if (destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
                iterator.remove();
                System.out.println("Destino turístico eliminado correctamente.");
                return;
            }
        }
        System.out.println("Error: destino turístico no encontrado.");
    }

    private static void mostrarDestinosOrdenados(ArrayList<DestinoTuristico> destinos) {
        ArrayList<DestinoTuristico> destinosOrdenados = new ArrayList<>(destinos);
        Collections.sort(destinosOrdenados, (d1, d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));

        System.out.println("Destinos turísticos ordenados por nombre:");
        for (DestinoTuristico destino : destinosOrdenados) {
            System.out.println(destino);
        }
    }

    private static void mostrarTodosPaises(ArrayList<Pais> paises) {
        System.out.println("Lista de todos los países:");
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

    private static void mostrarDestinosPorPais(Scanner scanner, ArrayList<DestinoTuristico> destinos) {
        System.out.print("Ingrese el código del país para mostrar los destinos turísticos: ");
        String codigoPais = scanner.nextLine();

        System.out.println("Destinos turísticos del país con código " + codigoPais + ":");
        for (DestinoTuristico destino : destinos) {
            if (destino.getPais().getCodigo().equalsIgnoreCase(codigoPais)) {
                System.out.println(destino);
            }
        }
    }
}
