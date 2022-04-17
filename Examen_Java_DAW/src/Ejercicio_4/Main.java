/*
Crear una clase llamada Producto que tiene un id de tipo String, y los atributos nombre, tamaño,
precio y fechaDeCompra. Crear un Array de Producto donde almacenaremos al menos 5 productos.
Calcular el precio medio, mínimo y máximo de todos los productos. Transformar dicho Array en un
HashMap donde el id del Producto sea la clave del HasMap y el resto de los atributos serán el
valor. Para almacenar el resto de los atributos crearemos una clase llamada SubProducto.
 */

package Ejercicio_4;

public class Main {

    public static void main(String[] args) {

        SubProducto producto = new SubProducto();

        producto.agregar(new SubProducto("A001", "lápiz", 10, 5.65, "10/5/2021"), 0);
        producto.agregar(new SubProducto("A002", "goma", 4, 2.50, "17/9/2021"), 1);
        producto.agregar(new SubProducto("A003", "carpeta", 40, 23.15, "1/11/2021"),
                         2);
        producto.agregar(new SubProducto("A004", "bolígrafo", 11, 5.99,
                                         "24/11/2021"), 3);
        producto.agregar(new SubProducto("A005", "regla", 30, 14.55, "7/12/2021"), 4);

        producto.imprimir();

        producto.precioMedio();

        producto.minMax();

        producto.arrayAHasMap(producto);
    }
}
