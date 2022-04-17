package Ejercicio_4;

import java.util.HashMap;

public class Producto {

    private String id;

    public Producto() {
    }

    public Producto(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return '"' + id + '"';
    }
}
