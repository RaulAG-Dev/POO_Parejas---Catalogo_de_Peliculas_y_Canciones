public class Pelicula{

    //Atributos 
    private int id;
    private int año;
    private float calificacion;
    private String nombre;
    private String notas;

    //Constructores
    public Pelicula(){

    }

    public Pelicula(int id, String nombre, int año, float calificacion, String notas){
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.calificacion = calificacion;
        this.notas = notas;
    }

}
