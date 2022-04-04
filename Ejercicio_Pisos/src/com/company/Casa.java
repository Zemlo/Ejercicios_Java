package com.company;

public abstract class Casa {

    private String tipoCasa;
    private double metrosCuadrados;

    public Casa(String tipoCasa, double metrosCuadrados) {
        this.tipoCasa = tipoCasa;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getTipoCasa() {
        return tipoCasa;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    @Override
    public String toString() {
        return "tipoCasa: " + getTipoCasa()+ '\'' +
                ", metrosCuadrados: " + getMetrosCuadrados() +
                '}';
    }
}
