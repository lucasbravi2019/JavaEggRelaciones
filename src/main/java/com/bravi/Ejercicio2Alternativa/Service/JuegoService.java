package com.bravi.Ejercicio2Alternativa.Service;

import java.util.ArrayList;
import java.util.Objects;

import com.bravi.Ejercicio2Alternativa.Model.Juego;
import com.bravi.Ejercicio2Alternativa.Model.Jugador;
import com.bravi.Ejercicio2Alternativa.Model.Revolver;

public class JuegoService {
    private Juego juego;

    public JuegoService(Juego juego) {
        this.juego = juego;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        juego.setJugadores(jugadores);
        juego.setRevolver(revolver);
    }

    public void ronda(Jugador jugador, Revolver r) {
        jugador.getService().disparo(r);
        System.out.println(r);
    }

}
