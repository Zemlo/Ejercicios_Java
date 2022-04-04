package com.company;

import java.util.Date;

public class ProfesorInterino extends Profesor {

    private int anyos;
    private int meses;

    public ProfesorInterino(String nif, String departamento, int anyos, int meses) {
        super(nif, departamento);
        this.anyos = anyos;
        this.meses = meses;
    }

    public int getAnyos() {
        return anyos;
    }

    public void setAnyos(int anyos) {
        this.anyos = anyos;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "ProfesorInterino{" +
                "anyos=" + anyos +
                ", meses=" + meses +
                '}';
    }
}
