package Ejercicio_4;

import java.sql.Array;
import java.util.Date;

public class Producto {

    private String nombre;
    private int tamaño;
    private double precio;
    private Date fechaDeCompra;
    private static String id;

    Array[] producto = new Array[5];

    public Producto() {
    }

    public Producto(String nombre, int tamaño, double precio, Date fechaDeCompra) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.fechaDeCompra = fechaDeCompra;
    }

    public Array agregar(Producto p) {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(Date fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Producto.id = id;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", tamaño=" + tamaño +
                ", precio=" + precio +
                ", fechaDeCompra=" + fechaDeCompra +
                '}';
    }
}
