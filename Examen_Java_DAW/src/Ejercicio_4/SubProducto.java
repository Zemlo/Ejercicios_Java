package Ejercicio_4;

import java.util.HashMap;

public class SubProducto
        extends Producto {

    private String nombre;
    private int tamanyo;
    private double precio;
    private String fechaDeCompra;

    private HashMap<String, SubProducto> productoHashMap = new HashMap<>();
    private SubProducto[] subProductos;

    public SubProducto() {
        subProductos = new SubProducto[5];
    }

    public SubProducto(String id, String nombre, int tamanyo, double precio, String fechaDeCompra) {
        super(id);
        this.nombre = nombre;
        this.tamanyo = tamanyo;
        this.precio = precio;
        this.fechaDeCompra = fechaDeCompra;
    }

    public void agregar(SubProducto p, int i) {
        this.subProductos[i] = p;
    }

    public void precioMedio() {
        double precio = 0;
        for (SubProducto e : subProductos) {
            precio += e.getPrecio();
        }
        System.out.println(String.format("\nEl precio medio de los productos en venta es: %.3f€",
                                         precio / subProductos.length));
    }

    public void minMax() {
        double max = 0;
        SubProducto prodMax = new SubProducto();
        for (SubProducto e : subProductos) {
            if (e.getPrecio() > max) {
                max = e.getPrecio();
                prodMax = e;
            }
        }
        double min = max;
        SubProducto prodMin = new SubProducto();
        for (SubProducto e : subProductos) {
            if (e.getPrecio() < min) {
                min = e.getPrecio();
                prodMin = e;
            }
        }
        System.out.print(String.format("\nEl precio mínimo es %.3f€. Y el producto que lo tiene " +
                                               "es: ", min) + prodMin);
        System.out.println(String.format("\nEl precio máximo es %.3f€. Y el producto que lo tiene" +
                                                 " " +
                                                 "es: ", max) + prodMax);
    }

    public void arrayAHasMap(SubProducto subProductos) {
        String[] idInter = new String[5];
        SubProducto[] prodInter = new SubProducto[5];
        int contador = 0;
        for (SubProducto e : this.subProductos) {
            idInter[contador] = (e.getId());
//            prodInter[contador] = {e.getNombre(),e.getTamanyo()};
            contador++;

        }
        for (int i = 0; i < idInter.length; i++) {
            productoHashMap.put(idInter[i], this.subProductos[i]);
        }
        System.out.println(productoHashMap);
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamanyo() {
        return tamanyo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }


    public void imprimir() {
        for (SubProducto e : subProductos) {
            System.out.println(e);
        }
    }

    public String toString() {
        return String.format("Producto { ID: %s, Nombre: %s, Tamaño: %d, Precio: %.3f, Fecha de " +
                                     "compra: %s }", getId(), getNombre(), getTamanyo(),
                             getPrecio(), getFechaDeCompra());
    }
}



