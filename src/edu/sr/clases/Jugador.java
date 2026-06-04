package edu.sr.clases;

import edu.sr.enumerados.PosicionJugador;

public class Jugador extends Profesional{

    private PosicionJugador posicionJugador;

    public Jugador(String nombre, double salarioBase ,PosicionJugador posicionJugador) {
        super(nombre,salarioBase);
        this.posicionJugador = posicionJugador;
    }

    public PosicionJugador getPosicionJugador() {
        return posicionJugador;
    }

    public void setPosicionJugador(PosicionJugador posicionJugador) {
        this.posicionJugador = posicionJugador;
    }

    @Override
    public double calcularBonus() {
        return this.getSalarioBase() * 0.10;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + this.getNombre() + '\'' +
                ", salarioBase=" + this.getSalarioBase() +
                ", posicionJugador=" + posicionJugador +
                '}';
    }
}
