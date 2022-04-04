package com.company;

public class Asalariado extends Persona {

    private double salario;
    private String nombre;
    private String apellidos;
    private int edad;

    public Asalariado(String nif, String nombre, String apellidos, int edad, double salario) {
        super(nif);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public void obtenerEstadoCivil() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nApellidos: %s\nEdad: %d\nNIF: %s\nSalario: %.2f", nombre, apellidos,
                             edad, getNif(), salario);
    }
}
