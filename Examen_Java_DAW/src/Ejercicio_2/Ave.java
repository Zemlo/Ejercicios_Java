package Ejercicio_2;

public class Ave
        extends Oviparo {

    private int numeroHuevos;

    public Ave() {
    }

    public Ave(String nombre, double peso, boolean comido, boolean poneHuevos, int numeroHuevos) {
        super(nombre, peso, comido, poneHuevos);
        this.numeroHuevos = numeroHuevos;
    }

    public int getNumeroHuevos() {
        return numeroHuevos;
    }

    public String toString() {
        return String.format("Nombre: %s\t\tPeso: %d\nHa comido: %s", getNombre(), getPeso(),
                                    comer());
    }

}
