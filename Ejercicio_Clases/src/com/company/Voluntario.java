package com.company;

public class Voluntario extends Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Voluntario(String nif, String nombre, String apellido, int edad) {
        super(nif);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void obtenerEstadoCivil() {

    }

    @Override
    public String toString() {
        return "Voluntario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
