package edu.sr.clases;

public class Tecnico extends Profesional {

    private String puesto;

    public Tecnico(String nombre, double salarioBase, String puesto) {
        super(nombre, salarioBase);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public double calcularBonus() {
        return 200;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nombre='" + this.getNombre() + '\'' +
                ", salarioBase=" + this.getSalarioBase() +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
