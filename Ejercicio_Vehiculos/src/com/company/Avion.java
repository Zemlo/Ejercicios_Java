package com.company;

public class Avion extends Aereo{

    private double numeroKilometros;

    public Avion(String nombre, String nombreAereo, double numeroKilometros) {
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
        return "Avion{" +
                "numeroKilometros=" + numeroKilometros +
                '}';
    }
}
