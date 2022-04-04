package com.company;

public class Piso
        extends Casa {

    private double precio;
    private String ubicacion;
    private int numeroPiso;

    public Piso(String tipoCasa, double metrosCuadrados, double precio, String ubicacion, int numeroPiso) {
        super(tipoCasa, metrosCuadrados);
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.numeroPiso = numeroPiso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    @Override
    public String toString() {
        return "Piso{" + super.toString() +
                "precio: " + precio +
                ", ubicacion: " + ubicacion + '\'' +
                ", numeroPiso: " + numeroPiso +
                '}';
    }
}
