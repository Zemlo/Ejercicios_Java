package Ejercicio_2;

public class Animal {

    private String nombre;
    private double peso;
    private boolean comido;

    public Animal() {
    }

    public Animal(String nombre, double peso, boolean comido) {
        this.nombre = nombre;
        this.peso = peso;
        this.comido = comido;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String comer() {
        if (comido) {
            return "SÍ";
        }
        return "NO";
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\t\tPeso: %d\nHa comido: %s", getNombre(), getPeso(),
                             comer());
    }
}
