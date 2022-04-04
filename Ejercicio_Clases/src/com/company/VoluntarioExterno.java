package com.company;

public class VoluntarioExterno extends Voluntario{

    private static int id = 1;
    private int identificadorExterno;

    public VoluntarioExterno(String nif, String nombre, String apellido, int edad, int identificadorExterno) {
        super(nif, nombre, apellido, edad);
        this.identificadorExterno = id;
        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        VoluntarioExterno.id = id;
    }

    public int getIdentificadorExterno() {
        return identificadorExterno;
    }

    public void setIdentificadorExterno(int identificadorExterno) {
        this.identificadorExterno = identificadorExterno;
    }

    @Override
    public String toString() {
        return "VoluntarioExterno{" +
                "identificadorExterno=" + identificadorExterno +
                '}';
    }
}
