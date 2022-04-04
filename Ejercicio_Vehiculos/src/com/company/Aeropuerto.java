package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class Aeropuerto {

    private TreeSet<Aereo> miAeropuerto;

    public Aeropuerto() {
        miAeropuerto = new TreeSet<>();
    }

    public void anadirVehiculo(Aereo a) {
        miAeropuerto.add(a);
    }

    public double mediaKM() {
        double media = 0;
        int contador = 0;
        for (Aereo a: miAeropuerto) {
            if (a instanceof Avion) {
                Avion avion = (Avion) a;
                media += avion.getNumeroKilometros();
                contador++;
            }
        }
        return media / contador;
    }

    public double mediaKMHelicoptero() {
        double media = 0;
        int contador = 0;
        Iterator<Aereo> iterator = miAeropuerto.iterator();
        while (iterator.hasNext()){
            Aereo a = (Aereo) iterator;
            if (a instanceof Helicoptero) {
                Helicoptero helicoptero = (Helicoptero) a;
                media += helicoptero.getNumeroKilometros();
                contador++;
            }
        }
    }
}
