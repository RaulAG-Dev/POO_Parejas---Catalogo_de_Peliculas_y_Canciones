import java.util.ArrayList;

public class ControladorCancion {
    private ArrayList<Cancion> catalogoCanciones;

    public ControladorCancion() {
        this.catalogoCanciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        catalogoCanciones.add(cancion);
        System.out.println("Canción agregada exitosamente.");
    }

    public boolean eliminarCancion(int id) {
        for (int i = 0; i < catalogoCanciones.size(); i++) {
            if (catalogoCanciones.get(i).getId() == id) {
                catalogoCanciones.remove(i);
                System.out.println("Canción eliminada exitosamente.");
                return true;
            }
        }
        System.out.println("Canción no encontrada.");
        return false;
    }

    public Cancion buscarCancionPorNombre(String nombre) {
        for (Cancion cancion : catalogoCanciones) {
            if (cancion.getNombre().equalsIgnoreCase(nombre)) {
                return cancion;
            }
        }
        return null;
    }

    public void listarCanciones() {
        if (catalogoCanciones.isEmpty()) {
            System.out.println("No hay canciones en el catálogo.");
        } else {
            System.out.println("--- Catálogo de Canciones ---");
            for (Cancion cancion : catalogoCanciones) {
                System.out.println(cancion.toString());
                System.out.println("--------------------");
            }
        }
    }
}
