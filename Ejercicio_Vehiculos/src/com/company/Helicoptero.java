package com.company;

public class Helicoptero extends Aereo{

    private double numeroKilometros;

    public Helicoptero(String nombre, String nombreAereo, double numeroKilometros) {
        super(nombre, nombreAereo);
        this.numeroKilometros = numeroKilometros;
    }

    public void encenderHelices() {

    }

    public double getNumeroKilometros() {
        return numeroKilometros;
    }

    public void setNumeroKilometros(double numeroKilometros) {
        this.numeroKilometros = numeroKilometros;
    }

    @Override
    public String toString() {
        return "Helicoptero{" +
                "numeroKilometros=" + numeroKilometros +
                '}';
    }
}
