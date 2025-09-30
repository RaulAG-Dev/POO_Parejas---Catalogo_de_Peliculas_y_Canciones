import java.util.ArrayList;

public class ControladorPelicula {

    private ArrayList<Pelicula> catalogoPeliculas;

    public ControladorPelicula() {
        this.catalogoPeliculas = new ArrayList<>();
    }

    public void agregarElemento(Pelicula pelicula) {
        if (pelicula != null) {
            this.catalogoPeliculas.add(pelicula);
            System.out.println("Película '" + pelicula.getNombre() + "' agregada con éxito.");
        } else {
            System.out.println("Por favor ingrese un nombre valido");
        }
    }

    public boolean eliminarElemento(int id) {
        for (int i = catalogoPeliculas.size() - 1; i >= 0; i--) {
            Pelicula p = catalogoPeliculas.get(i);
            
            if (p.getId() == id) {
                catalogoPeliculas.remove(i);
                System.out.println("Película con ID " + id + " eliminada.");
                return true;
            }
        }
        System.out.println("Película con ID " + id + " no encontrada.");
        return false;
    }

    public ArrayList<Pelicula> buscarPorNombre(String nombre) {
        ArrayList<Pelicula> resultados = new ArrayList<>();
        String nombreBuscado = nombre.toLowerCase();
        
        for (Pelicula p : this.catalogoPeliculas) {
            if (p.getNombre().toLowerCase().contains(nombreBuscado)) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    public void listarTodosLosElementos() {
        if (catalogoPeliculas.isEmpty()) {
            System.out.println("El catálogo de películas está vacío.");
            return;
        }
        
        System.out.println("\n--- Catálogo de Películas (" + catalogoPeliculas.size() + " elementos) ---");
        for (Pelicula p : this.catalogoPeliculas) {
            System.out.println(p.toString());
        }
    }
}