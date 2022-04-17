package Ejercicio_2;

public class Oviparo
        extends Animal {

    private boolean poneHuevos;

    public Oviparo() {
        super();
    }

    public Oviparo(String nombre, double peso, boolean comido, boolean poneHuevos) {
        super(nombre, peso, comido);
        this.poneHuevos = poneHuevos;
    }

    public boolean isPoneHuevos() {
        return poneHuevos;
    }

    public String ponerHuevos() {
        if (poneHuevos) {
            return "pone huevos";
        }
        return "no pone huevos";
    }


    @Override
    public String toString() {
        return String.format("Nombre: %s\\t\\tPeso: %d\\nHa comido: %s", getNombre(), getPeso(),
                             comer());
    }
}
