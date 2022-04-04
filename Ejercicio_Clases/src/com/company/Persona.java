package com.company;

public abstract class Persona {

    private String nif;

    public Persona(String nif) {
        this.nif = nif;
    }

    public abstract void obtenerEstadoCivil();

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nif='" + nif + '\'' +
                '}';
    }
}
