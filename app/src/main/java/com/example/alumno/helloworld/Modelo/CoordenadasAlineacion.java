package com.example.alumno.helloworld.Modelo;

/**
 * Created by damonfor on 05/03/2015.
 */
public class CoordenadasAlineacion {
    private ObjetoEntrenamiento id_obj;
    private Alineacion id_alin;
    private double coordx;
    private double coordy;

    public CoordenadasAlineacion(ObjetoEntrenamiento id_obj, Alineacion id_alin, double coordx, double coordy) {
        this.id_obj = id_obj;
        this.id_alin = id_alin;
        this.coordx = coordx;
        this.coordy = coordy;
    }

    public ObjetoEntrenamiento getId_obj() {
        return id_obj;
    }

    public void setId_obj(ObjetoEntrenamiento id_obj) {
        this.id_obj = id_obj;
    }

    public Alineacion getId_alin() {
        return id_alin;
    }

    public void setId_alin(Alineacion id_alin) {
        this.id_alin = id_alin;
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
