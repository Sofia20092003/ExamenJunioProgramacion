package edu.sr;

import edu.sr.clases.GestorClub;
import edu.sr.clases.Jugador;
import edu.sr.clases.Tecnico;
import edu.sr.enumerados.PosicionJugador;
import edu.sr.excepciones.PresupuestoExcedidoException;
import edu.sr.excepciones.ProfesionalNoEncontradoException;

import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        GestorClub gestorClub = new GestorClub();

        int opcion;

        while (true) {
            System.out.println("===BIENVENIDO A NUESTRO CLUB==");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Contratar Jugador");
            System.out.println("2. Contratar Tecnico");
            System.out.println("3. Despedir Profesional");
            System.out.println("4. Ver Nóminas Totales");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Introduzca el nombre del jugador: ");
                        String nombre = sc.nextLine();

                        System.out.println("Digite el salario base de ese jugador: ");
                        double salario = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Digite la posicion del jugador, estas son sus opciones: ");
                        System.out.println("PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO");
                        String posicionJugador = sc.nextLine().toUpperCase();

                        PosicionJugador pos= PosicionJugador.valueOf(posicionJugador);

                        gestorClub.contratar(new Jugador(nombre, salario, pos));
                    } catch (PresupuestoExcedidoException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try{
                        System.out.println("Introduzca el nombre del Técnico: ");
                        String nombreTecnico = sc.nextLine();

                        System.out.println("Introduzca el salario base del técnico: ");
                        double salarioBaseTecnico = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Introduzca el puesto que tiene (Ej:Entrenador, Fisioterapeuta....): ");
                        String puestoTecnico = sc.nextLine();

                        gestorClub.contratar(new Tecnico(nombreTecnico, salarioBaseTecnico, puestoTecnico));
                    } catch (PresupuestoExcedidoException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Introduzca el nombre del Profesional que quiere despedir: ");
                        String nombreProfesional = sc.nextLine();

                        gestorClub.despedir(nombreProfesional);

                        System.out.println("El empleado "+nombreProfesional+" ha sido despedido.");
                    } catch (ProfesionalNoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    gestorClub.mostrarNominas();
                    break;
                case 5:
                    System.out.println("Cerrando Programa......");
                    sc.close();
                    break;
                default:
                    System.out.println("Opcion incorrecta...");
            }
        }
    }
}
