package com.company;

public class Profesor extends Persona{

    private String departamento;

    public Profesor(String nif, String departamento) {
        super(nif);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void obtenerEstadoCivil() {
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
