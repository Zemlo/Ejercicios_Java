package com.company;

public class Aereo extends Vehiculo{

    private String nombreAereo;

    public Aereo(String nombre, String nombreAereo) {
        super(nombre);
        this.nombreAereo = nombreAereo;
    }

    public void volar() {

    }

    public String getNombreAereo() {
        return nombreAereo;
    }

    public void setNombreAereo(String nombreAereo) {
        this.nombreAereo = nombreAereo;
    }

    @Override
    public boolean transportar() {
        return false;
    }

    @Override
    public String toString() {
        return "Aereo{" +
                "nombreAereo='" + nombreAereo + '\'' +
                '}';
    }
}
