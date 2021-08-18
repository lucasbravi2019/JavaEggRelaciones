package com.bravi.Ejercicio2.Model;

import java.util.ArrayList;
import java.util.Objects;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolver() {
        return this.revolver;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }

    public Juego jugadores(ArrayList<Jugador> jugadores) {
        setJugadores(jugadores);
        return this;
    }

    public Juego revolver(RevolverAgua revolver) {
        setRevolver(revolver);
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
        return Objects.equals(jugadores, juego.jugadores) && Objects.equals(revolver, juego.revolver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jugadores, revolver);
    }

    @Override
    public String toString() {
        return "{" + " jugadores='" + getJugadores() + "'" + ", revolver='" + getRevolver() + "'" + "}";
    }

}
