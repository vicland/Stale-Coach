package com.stalecoach.stalecoach.modelo;

/**
 * Created by damonfor on 05/03/2015.
 */
public class Entrenamineto {
    private int id_entre;
    private String nombre;
    private Deporte deporte;
    private String imagen_miniatura;
    private String descripcion;
    private CategoriaEntrenamiento categoria_entrenamiento;

    public Entrenamineto(int id_entre, String nombre, Deporte deporte, String imagen_miniatura, String descripcion, CategoriaEntrenamiento categoria_entrenamiento) {
        this.id_entre = id_entre;
        this.nombre = nombre;
        this.deporte = deporte;
        this.imagen_miniatura = imagen_miniatura;
        this.descripcion = descripcion;
        this.categoria_entrenamiento = categoria_entrenamiento;
    }

    public int getId_entre() {
        return id_entre;
    }

    public void setId_entre(int id_entre) {
        this.id_entre = id_entre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public String getImagen_miniatura() {
        return imagen_miniatura;
    }

    public void setImagen_miniatura(String imagen_miniatura) {
        this.imagen_miniatura = imagen_miniatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CategoriaEntrenamiento getCategoria_entrenamiento() {
        return categoria_entrenamiento;
    }

    public void setCategoria_entrenamiento(CategoriaEntrenamiento categoria_entrenamiento) {
        this.categoria_entrenamiento = categoria_entrenamiento;
    }
}
