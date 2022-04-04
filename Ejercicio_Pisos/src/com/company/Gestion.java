package com.company;

import java.util.LinkedList;

public class Gestion {

    private LinkedList<Piso> Pisos;

    public Gestion() {
        Pisos = new LinkedList<>();
    }

    public void anadirPiso(Piso piso) {
        Pisos.push(piso);
    }

    public void precioMedio() {
        double contador = 0;
        for (int i = 0; i < Pisos.size(); i++) {
            Piso media = Pisos.get(i);
            contador += media.getPrecio();
        }
        System.out.println("El precio medio es: " + contador / Pisos.size());
    }

    public void precioAlto() {

    }

}
