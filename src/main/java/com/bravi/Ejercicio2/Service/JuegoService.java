package com.bravi.Ejercicio2.Service;

import java.util.ArrayList;

import com.bravi.Ejercicio2.Model.Juego;
import com.bravi.Ejercicio2.Model.Jugador;
import com.bravi.Ejercicio2.Model.RevolverAgua;

public class JuegoService {
    JugadorService j = new JugadorService();
    RevolverAguaService revolver = new RevolverAguaService();

    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        return new Juego(jugadores, r);
    }

    public void ronda(Jugador jugador, RevolverAgua r) {
        System.out.println("Turno de " + jugador.getNombre());
        j.disparo(jugador, r);
        revolver.siguienteChorro(r);
    }

    public void jugar(Juego juego) {

        for (Jugador jugador : juego.getJugadores()) {
            ronda(jugador, juego.getRevolver());
            if (jugador.getMojado()) {
                System.out.println("El " + jugador.getNombre() + " perdio");
                return;
            }
        }
    }
}
