package com.company;

public abstract class Vehiculo {

    private String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean transportar();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
