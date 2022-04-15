package Ejercicio_3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Gestion {

    HashSet<Vehiculos> vehiculos;

    public Gestion() {
        vehiculos = new HashSet<>();
    }

    public void agregar(Vehiculos vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void calcularMediaKmCoche() {
        int numCoches = 0;
        double numKm = 0;
        Iterator<Vehiculos> iterator = vehiculos.iterator();
        while (iterator.hasNext()) {
            Vehiculos vehiculo = iterator.next();
            if (vehiculo.getTipoVehiculo().equals("Coche")) {
                numCoches++;
                numKm += vehiculo.getKilometros();
            }
        }
        System.out.println(numKm / numCoches);
    }

    public void maxMinKm() {
        double max = 0;
        Iterator<Vehiculos> iterator = vehiculos.iterator();
        while (iterator.hasNext()) {
            Vehiculos vehiculo = iterator.next();
            if (vehiculo.getKilometros() >= max) {
                max = vehiculo.getKilometros();
            }
        }
        double min = max;
        Iterator<Vehiculos> iterator1 = vehiculos.iterator();
        while (iterator1.hasNext()) {
            Vehiculos vehiculo = iterator1.next();
            if (vehiculo.getKilometros() < min) {
                min = vehiculo.getKilometros();
            }
        }
        System.out.println(max + ", " + min);
    }

    public int tamaño() {
        return vehiculos.size();
    }

    @Override
    public String toString() {
        return "" + vehiculos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gestion)) return false;
        Gestion gestion1 = (Gestion) o;
        return vehiculos.equals(gestion1.vehiculos) && vehiculos.equals(gestion1.vehiculos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehiculos, vehiculos);
    }

}

