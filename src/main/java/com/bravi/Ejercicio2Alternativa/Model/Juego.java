package com.bravi.Ejercicio2Alternativa.Model;

import java.util.ArrayList;
import java.util.Objects;

import com.bravi.Ejercicio2Alternativa.Service.JuegoService;

public class Juego {
    private ArrayList<Jugador> jugadores;

    private Revolver revolver;

    private JuegoService service;

    public Juego() {
        this.service = new JuegoService(this);
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
        this.service = new JuegoService(this);
    }

    public ArrayList<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return this.revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public JuegoService getService() {
        return this.service;
    }

    public void setService(JuegoService service) {
        this.service = service;
    }

    public Juego jugadores(ArrayList<Jugador> jugadores) {
        setJugadores(jugadores);
        return this;
    }

    public Juego revolver(Revolver revolver) {
        setRevolver(revolver);
        return this;
    }

    public Juego service(JuegoService service) {
        setService(service);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Juego)) {
            return false;
        }
        Juego juego = (Juego) o;
        return Objects.equals(jugadores, juego.jugadores) && Objects.equals(revolver, juego.revolver)
                && Objects.equals(service, juego.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jugadores, revolver, service);
    }

    @Override
    public String toString() {
        return "{" + " jugadores='" + getJugadores() + "'" + ", revolver='" + getRevolver() + "'" + ", service='"
                + getService() + "'" + "}";
    }

}
