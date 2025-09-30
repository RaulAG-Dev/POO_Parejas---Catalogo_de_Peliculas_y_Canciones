package com.catalogo.peliculas;

public class Pelicula{

    private int id;
    private int año;
    private float calificacion;
    private String nombre;
    private String notas;



    public Pelicula(){

    }

    public Pelicula(int id, String nombre, int año, float calificacion, String notas){
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.calificacion = calificacion;
        this.notas = notas;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAño(int año){
        this.año = año;
    }

    public void setCalificacion(float calificacion){
        this.calificacion = calificacion;
    }

    public void setNotas(String notas){
        this.notas = notas;
    }



    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public int getAño(){
        return año;
    }

    public float getCalifiacion(){
        return calificacion;
    }

    public String getNotas(){
        return notas;
    }



    @Override
    public String toString(){
        return "Id: " + id + "\nNombre: " + nombre + "\nAño" + año + "\nCalificación: " + calificacion + "\nNotas:" + notas;
    }


}
