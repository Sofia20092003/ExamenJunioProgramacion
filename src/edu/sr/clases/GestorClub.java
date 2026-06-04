package edu.sr.clases;

import edu.sr.excepciones.PresupuestoExcedidoException;
import edu.sr.excepciones.ProfesionalNoEncontradoException;

import java.util.ArrayList;

public class GestorClub {
    private static final double PRESUPUESTO_MAXIMO=10000.00;
    private static ArrayList<Profesional> profesionales;

    public GestorClub() {
        profesionales=new ArrayList<>();
    }

    public ArrayList<Profesional> getProfesionales() {
        return profesionales;
    }


    public void contratar(Profesional profesional) throws PresupuestoExcedidoException{

        double total = 0;

        for (Profesional p : profesionales) {
            total += p.getSalarioBase();
        }

        total += profesional.getSalarioBase();

        if (total > PRESUPUESTO_MAXIMO) {
            throw new PresupuestoExcedidoException("Se supera el presupuesto máximo del club.");
        }

        profesionales.add(profesional);
    }

    public void despedir(String nombre) {

        for (Profesional p : profesionales) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                profesionales.remove(p);
                return;
            }
        }

        throw new ProfesionalNoEncontradoException("No existe ningún profesional con ese nombre.");
    }

    public void mostrarNominas() {

        double gastoTotal = 0;

        System.out.println("\n===== NÓMINAS =====");

        for (Profesional p : profesionales) {

            String ocupacion = "";

            if (p instanceof Jugador) {
                ocupacion = ((Jugador) p).getPosicionJugador().toString();
            } else if (p instanceof Tecnico) {
                ocupacion = ((Tecnico) p).getPuesto();
            }

            double salarioTotal = p.salarioTotal();

            System.out.println(
                    p.getNombre() + " - "
                            + ocupacion + " - "
                            + salarioTotal + " €");

            gastoTotal += salarioTotal;
        }

        System.out.println("\nGasto total del club: "
                + gastoTotal + " €");
    }
}
