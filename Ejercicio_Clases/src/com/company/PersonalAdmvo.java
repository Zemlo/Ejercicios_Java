package com.company;

public class PersonalAdmvo extends Asalariado{

    private String puesto;

    public PersonalAdmvo(String nif, String nombre, String apellidos, int edad, double salario, String puesto) {
        super(nif, nombre, apellidos, edad, salario);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "PersonalAdmvo{" +
                "puesto='" + puesto + '\'' +
                '}';
    }
}
