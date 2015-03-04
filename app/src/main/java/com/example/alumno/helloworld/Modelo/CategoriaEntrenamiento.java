package com.stalecoach.stalecoach.modelo;

/**
 * Created by damonfor on 05/03/2015.
 */
public class CategoriaEntrenamiento {
    private int id_cat;
    private String nombre;
    private String descripcion;

    public CategoriaEntrenamiento(int id_cat, String nombre, String descripcion) {
        this.id_cat = id_cat;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
