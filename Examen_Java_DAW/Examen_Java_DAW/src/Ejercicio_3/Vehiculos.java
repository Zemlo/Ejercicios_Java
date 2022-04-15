package Ejercicio_3;

public class Vehiculos {

    private String matricula;
    private String tipoVehiculo;
    private String color;
    private double kilometros;
    private int numeroPuertas;

    public Vehiculos() {
    }

    public Vehiculos(String matricula, String tipoVehiculo, String color, double kilometros, int numeroPuertas) {
        this.matricula = matricula;
        this.tipoVehiculo = tipoVehiculo;
        this.color = color;
        this.kilometros = kilometros;
        this.numeroPuertas = numeroPuertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "{" +
                "matrícula="+ getMatricula()+
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", color='" + color + '\'' +
                ", kilometros=" + kilometros +
                ", numeroPuertas=" + numeroPuertas +
                "\n";
    }
}
