/*
Tenemos la clase Animal que tiene 3 atributos: el nombre del animal, el peso y si ha comido.
Tendremos un método comer(), que nos devolverá si el animal ha comido o no (1,75 puntos).
 - Tenemos la clase Oviparo que hereda de la clase Animal y tendrá un método que se llama
 ponerHuevos()
 - Tenemos la clase Ave que hereda de Oviparo que tendrá el atributo numeroHuevos.
 - Crear un ArrayList de Aves donde se calcule la media de los huevos que pones las aves, el ave
 que pone más huevos y el ave que pone menos huevos. Para recorrer el ArrayList hay que emplear al
  menos 2 métodos diferentes
 */

package Ejercicio_2;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        "águila", 35.7, true, true, 3
        "cóndor", 27.5, false, true, 1
        "tigre", 183.46, false
        "vaca", 650.70, true
         */

        Aves animales = new Aves();

        animales.agregar(new Animal("tigre", 183.46, false));
        animales.agregar(new Animal("elefante", 1573.65, true));
        animales.agregar(new Animal("vaca", 650.70, true));
        animales.agregar(new Ave("águila", 35.7, true, true, 3));
        animales.agregar(new Ave("cóndor", 27.5, false, true, 1));
        animales.agregar(new Ave("jilguero", .56, true, true, 30));
        animales.agregar(new Ave("canario", .87, false, true, 4));
        animales.agregar(new Oviparo("boa", 53.82, true, true));
        animales.agregar(new Oviparo("ornitorrinco", 15.98, true, true));
        animales.agregar(new Oviparo("rana", 0.58, false, true));

        System.out.println(animales);

        System.out.println(animales.mediaHuevos(new Ave()));
        animales.mayor();
//        System.out.println(animales.menor(new Ave()));

    }
}
