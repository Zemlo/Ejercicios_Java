package Ejercicio_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Aves {

    private ArrayList<Animal> animales;

    public Aves() {
        animales = new ArrayList<>();
    }

    public void agregar(Animal animal) {
        this.animales.add(animal);
    }

    public Object mediaHuevos(Ave huevo) {
        double numHuevos = 0;
        double numAves = 0;
        ArrayList<Object> huevos = new ArrayList<>();
        Iterator<Animal> iterator = animales.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal instanceof Ave) {
                Ave ave = (Ave) animal;
                if (ave.isPoneHuevos()) {
                    numAves++;
                    numHuevos += ave.getNumeroHuevos();
                }
            }
        }
        double medHuevos = numHuevos / numAves;
        huevos.add(medHuevos);
        return huevos;
    }

    public void mayor() {
        int max = 0;
        Iterator<Animal> iterator = animales.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal instanceof Ave) {
                Ave ave = (Ave) animal;
                if (ave.getNumeroHuevos() >= max) {
                    max = ave.getNumeroHuevos();
                }
            }
        }
        System.out.println(max);
    }

/*    public Object menor(Ave huevo) {
        int min = mayor();
        Iterator<Animal> iterator = animales.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal instanceof Ave) {
                Ave ave = (Ave) animal;
                if (ave.getNumeroHuevos() < min) {
                    min = ave.getNumeroHuevos();
                }
            }
        }
        return min;
    }*/

    @Override
    public String toString() {
        String imprimir = "";
        for (Animal e: animales) {
            imprimir += e.toString();
        }
        return String.format("%s", imprimir);
    }
}
