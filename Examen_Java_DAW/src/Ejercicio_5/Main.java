/*
Se desea realizar un programa que gestione desde la clase Main un listín telefónico con los
nombres de los clientes de una empresa de moda. El programa debe incorporar un menú donde estén
las opciones de consultar teléfonos y añadir teléfono de nuevo cliente. El listín debe estar
guardado en el fichero de texto listin.txt donde el nombre del cliente y su teléfono deben
aparecer separados por comas y cada cliente en una línea distinta.
 */

package Ejercicio_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.agregarCliente(new Cliente("Marta", 753951123));
        cliente.agregarCliente(new Cliente("Antonio", 951357789));
        cliente.agregarCliente(new Cliente("Juan", 654852357));
        cliente.agregarCliente(new Cliente("Marcial", 456951357));
        cliente.agregarCliente(new Cliente("Laura", 649237891));

        int opcion;
        Scanner entrada = new Scanner(System.in);
        do {

            System.out.println("Elegir opción:");
            System.out.println("---------------");
            System.out.println("1. Buscar cliente");
            System.out.println("2. Añadir cliente");
            System.out.println("3. Salir");
            System.out.println();
            System.out.print("Introduce un número:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    cliente.leerFichero();
                    cliente.buscarCliente("Laura");
                    break;
                case 2:
                    cliente.agregarCliente(new Cliente("Estela", 245635789));
                    cliente.escribirFichero();
                    break;
                case 3:
                    System.out.println("Has salido de la aplicación.");
                    System.exit(0);
                    break;

            }
        } while (!(opcion < 1 && opcion >= 3));

    }
}
