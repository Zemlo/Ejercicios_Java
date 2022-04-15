/*
Una empresa de alquiler de coches tiene que gestionar los vehículos que alquilan. Crear dicha
clase con los atributos matricula, tipoVehiculo, color, kilometros y numeroPuertas. Crear un
HashSet para almacenar dichos vehículos y calcular la media del kilometraje del tipo Coche,
visualizar los datos del coche que tiene más kilómetros y el que tienes menos kilómetros. Recordar
que la matrícula es unívoca y que no pueden haber elementos repetidos dentro del HashSet. Para
manejar el HashSet deberemos crear una clase que maneje los métodos que se piden. Los tipos de
vehículos pueden ser coches, camionetas, furgones, mixtoAdaptables.
 */

package Ejercicio_3;

public class Main {

    public static void main(String[] args) {

        Gestion vehiculo = new Gestion();

        vehiculo.agregar(new Vehiculos("4258TYU", "Coche", "Azul", 150389, 5));
        vehiculo.agregar(new Vehiculos("4958LOP", "Furgón", "Negro",15962 , 3));
        vehiculo.agregar(new Vehiculos("4258TYU", "Camión", "Rojo", 456895, 4));
        vehiculo.agregar(new Vehiculos("7486AWP", "Coche", "Amarillo", 436987, 5));
        vehiculo.agregar(new Vehiculos("2693MHT", "Coche", "Verde", 25862, 5));

        System.out.println(vehiculo);
        vehiculo.calcularMediaKmCoche();
        System.out.println(vehiculo.tamaño());
        vehiculo.maxMinKm();
    }
}
