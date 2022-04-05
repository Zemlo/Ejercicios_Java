package com;

public class Datos {

    private String nombre;
    private String email;
    private int telefono;
    private double descuento;

                      // palabras[1], palabras[2], palabras[3], palabras[4]
    public Datos(String nombre, String email, int telefono, double descuento) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                ", descuento=" + descuento +
                '}';
    }
}
