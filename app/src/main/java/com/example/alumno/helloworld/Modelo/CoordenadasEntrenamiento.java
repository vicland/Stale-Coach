package com.example.alumno.helloworld.Modelo;

/**
 * Created by damonfor on 05/03/2015.
 */
public class CoordenadasEntrenamiento {
    private ObjetoEntrenamiento id_obj;
    private Entrenamineto id_entr;
    private double coordx;
    private double coordy;

    public CoordenadasEntrenamiento(ObjetoEntrenamiento id_obj, Entrenamineto id_entr, double coordx, double coordy) {
        this.id_obj = id_obj;
        this.id_entr = id_entr;
        this.coordx = coordx;
        this.coordy = coordy;
    }

    public ObjetoEntrenamiento getId_obj() {
        return id_obj;
    }

    public void setId_obj(ObjetoEntrenamiento id_obj) {
        this.id_obj = id_obj;
    }

    public Entrenamineto getId_entr() {
        return id_entr;
    }

    public void setId_entr(Entrenamineto id_entr) {
        this.id_entr = id_entr;
    }

    public double getCoordx() {
        return coordx;
    }

    public void setCoordx(double coordx) {
        this.coordx = coordx;
    }

    public double getCoordy() {
        return coordy;
    }

    public void setCoordy(double coordy) {
        this.coordy = coordy;
    }
}
