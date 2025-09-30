package org.proyecto;
import org.proyecto.cancion.ControladorCanciones;


import org.proyecto.cancion.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorCanciones controlador = new ControladorCanciones();

        int opcion;

        do {
            System.out.println("\n📚 Menú principal");
            System.out.println("1. Gestionar catálogo de Películas (no disponible)");
            System.out.println("2. Gestionar catálogo de Canciones");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("⚠️ Esta opción está siendo desarrollada por otro compañero.");
                    break;

                case 2:
                    gestionarCanciones(scanner, controlador);
                    break;

                case 0:
                    System.out.println("👋 ¡Hasta luego!");
                    break;

                default:
                    System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void gestionarCanciones(Scanner scanner, ControladorCanciones controlador) {
        int opcion;
        do {
            System.out.println("\n🎵 Menú de Canciones");
            System.out.println("1. Agregar canción");
            System.out.println("2. Eliminar canción por nombre");
            System.out.println("3. Buscar canción por nombre");
            System.out.println("4. Listar todas las canciones");
            System.out.println("0. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cantante: ");
                    String cantante = scanner.nextLine();
                    System.out.print("Calificación (1-5): ");
                    int calificacion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Notas: ");
                    String notas = scanner.nextLine();

                    int id = generarIdDesdeMatricula("A01234567"); // puedes cambiar la matrícula
                    Cancion nueva = new Cancion(id, nombre, cantante, calificacion, notas);
                    controlador.agregarCancion(nueva);
                    break;

                case 2:
                    System.out.print("Nombre de la canción a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    controlador.eliminarCancion(nombreEliminar);
                    break;

                case 3:
                    System.out.print("Nombre de la canción a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Cancion encontrada = controlador.buscarCancion(nombreBuscar);
                    if (encontrada != null) {
                        System.out.println(encontrada);
                    }
                    break;

                case 4:
                    controlador.listarCanciones();
                    break;

                case 0:
                    System.out.println("↩️ Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static int generarIdDesdeMatricula(String matricula) {
        int suma = 0;
        for (char c : matricula.toCharArray()) {
            if (Character.isDigit(c)) {
                suma += Character.getNumericValue(c);
            }
        }
        return suma;
    }
}
