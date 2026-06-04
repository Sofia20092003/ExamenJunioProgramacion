package edu.sr.clases;

import edu.sr.excepciones.PresupuestoExcedidoException;

import java.util.ArrayList;

public class GestorClub {
    private final double PRESUPUESTO_MAXIMO=10000.00;
    private ArrayList<Profesional> profesionales;

    public GestorClub() {
        this.profesionales=new ArrayList<>();
    }

    public ArrayList<Profesional> getProfesionales() {
        return profesionales;
    }

    public void setProfesionales(ArrayList<Profesional> profesionales) {
        this.profesionales = profesionales;
    }

    public static void presupuestoProfesionales() throws PresupuestoExcedidoException{

        if ()
    }
}
