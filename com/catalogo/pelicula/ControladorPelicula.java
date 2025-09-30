package com.catalogo.peliculas;

import java.util.ArrayList;

public class ControladorPelicula {
    private ArrayList<Pelicula> catalogoPeliculas;

    public ControladorPelicula() {
        this.catalogoPeliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        catalogoPeliculas.add(pelicula);
        System.out.println("Película agregada exitosamente.");
    }

    public boolean eliminarPelicula(int id) {
        for (int i = 0; i < catalogoPeliculas.size(); i++) {
            if (catalogoPeliculas.get(i).getId() == id) {
                catalogoPeliculas.remove(i);
                System.out.println("Película eliminada exitosamente.");
                return true;
            }
        }
        System.out.println("Película no encontrada.");
        return false;
    }

    public Pelicula buscarPeliculaPorNombre(String nombre) {
        for (Pelicula pelicula : catalogoPeliculas) {
            if (pelicula.getNombre().equalsIgnoreCase(nombre)) {
                return pelicula;
            }
        }
        return null;
    }

    public void listarPeliculas() {
        if (catalogoPeliculas.isEmpty()) {
            System.out.println("No hay películas en el catálogo.");
        } else {
            System.out.println("--- Catálogo de Películas ---");
            for (Pelicula pelicula : catalogoPeliculas) {
                System.out.println(pelicula.toString());
            }
        }
    }
}