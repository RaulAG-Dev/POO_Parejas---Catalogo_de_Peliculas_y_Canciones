package com.catalogo.main;
import com.catalogo.peliculas.ControladorPelicula;
import com.catalogo.peliculas.Pelicula;
import com.catalogo.canciones.ControladorCancion;
import com.catalogo.canciones.Cancion;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorPelicula controladorPelicula = new ControladorPelicula();
        ControladorCancion controladorCancion = new ControladorCancion();

        int opcionPrincipal;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Gestionar Películas");
            System.out.println("2. Gestionar Canciones");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (opcionPrincipal) {
                case 1:
                    gestionarPeliculas(scanner, controladorPelicula);
                    break;
                case 2:
                    gestionarCanciones(scanner, controladorCancion);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionPrincipal != 0);

        scanner.close();
    }

    public static void gestionarPeliculas(Scanner scanner, ControladorPelicula controlador) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE PELÍCULAS ---");
            System.out.println("1. Agregar Película");
            System.out.println("2. Eliminar Película");
            System.out.println("3. Buscar Película por Nombre");
            System.out.println("4. Listar todas las Películas");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Año: ");
                    int anio = scanner.nextInt();
                    System.out.print("Ingrese Calificación: ");
                    float calificacion = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("Ingrese Notas: ");
                    String notas = scanner.nextLine();
                    controlador.agregarPelicula(new Pelicula(id, nombre, anio, calificacion, notas));
                    break;
                case 2:
                    System.out.print("Ingrese el ID de la película a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    controlador.eliminarPelicula(idEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la película a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Pelicula peliculaEncontrada = controlador.buscarPeliculaPorNombre(nombreBuscar);
                    if (peliculaEncontrada != null) {
                        System.out.println("Película encontrada:");
                        System.out.println(peliculaEncontrada);
                    } else {
                        System.out.println("No se encontró ninguna película con ese nombre.");
                    }
                    break;
                case 4:
                    controlador.listarPeliculas();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void gestionarCanciones(Scanner scanner, ControladorCancion controlador) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE CANCIONES ---");
            System.out.println("1. Agregar Canción");
            System.out.println("2. Eliminar Canción");
            System.out.println("3. Buscar Canción por Nombre");
            System.out.println("4. Listar todas las Canciones");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Cantante: ");
                    String cantante = scanner.nextLine();
                    System.out.print("Ingrese Calificación (entero): ");
                    int calificacion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese Notas: ");
                    String notas = scanner.nextLine();
                    controlador.agregarCancion(new Cancion(id, nombre, cantante, calificacion, notas));
                    break;
                case 2:
                    System.out.print("Ingrese el ID de la canción a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    controlador.eliminarCancion(idEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la canción a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Cancion cancionEncontrada = controlador.buscarCancionPorNombre(nombreBuscar);
                    if (cancionEncontrada != null) {
                        System.out.println("Canción encontrada:");
                        System.out.println(cancionEncontrada);
                    } else {
                        System.out.println("No se encontró ninguna canción con ese nombre.");
                    }
                    break;
                case 4:
                    controlador.listarCanciones();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
}