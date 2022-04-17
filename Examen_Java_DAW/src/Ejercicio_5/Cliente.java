package Ejercicio_5;

import java.io.*;
import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private int telefono;

    private ArrayList<Cliente> clientes;

    public Cliente() {
        clientes = new ArrayList<>();
    }

    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void buscarCliente(String nombre) {
        for (Cliente e : clientes) {
            if (e.getNombre().equals(nombre)) {
                System.out.println(e);
            }
        }
    }

    public void escribirFichero() {
        FileWriter ficheroEscritura = null;

        try {

            ficheroEscritura = new FileWriter("listin.txt", true);
            for (Cliente e : clientes) {
                ficheroEscritura.write(e.getNombre()+";"+e.getTelefono() + "\n");
            }
            ficheroEscritura.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leerFichero() {

        try {
            this.clientes.clear();
            BufferedReader ficheroLectura = new BufferedReader(new FileReader("listin.txt"));
            String linea = ficheroLectura.readLine();
            while (linea != null) {
                String[] lineaFichero = linea.split(";");
                String nombre = lineaFichero[0];
                int telefono = Integer.parseInt(lineaFichero[1]);
                clientes.add(new Cliente(nombre, telefono));
                linea = ficheroLectura.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void imprimir() {
//        Iterator<Cliente> iterator = clientes.iterator();
//        while (iterator.hasNext()) {
//            Cliente cliente = iterator.next();
//            System.out.println(cliente);
//        }
        for (Cliente e : clientes)
            System.out.println(e);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\t\tTeléfono: %d", getNombre(), getTelefono());
    }
}

