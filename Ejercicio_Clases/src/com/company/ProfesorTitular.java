package com.company;

public class ProfesorTitular extends Profesor{

    private String materia;

    public ProfesorTitular(String nif, String departamento, String materia) {
        super(nif, departamento);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "ProfesorTitular{" +
                "materia='" + materia + '\'' +
                '}';
    }
}
