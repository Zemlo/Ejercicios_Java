package com.company;

public class VoluntarioMiembro extends Voluntario{

    private static int id = 1;
    private int identificadorMiembro;

    public VoluntarioMiembro(String nif, String nombre, String apellido, int edad, int identificadorMiembro) {
        super(nif, nombre, apellido, edad);
        this.identificadorMiembro = id;
        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        VoluntarioMiembro.id = id;
    }

    public int getIdentificadorMiembro() {
        return identificadorMiembro;
    }

    public void setIdentificadorMiembro(int identificadorMiembro) {
        this.identificadorMiembro = identificadorMiembro;
    }

    @Override
    public String toString() {
        return "VoluntarioMiembro{" +
                "identificadorMiembro=" + identificadorMiembro +
                '}';
    }
}
