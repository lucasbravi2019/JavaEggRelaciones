package com.bravi.Ejercicio2.Model;

import java.util.Objects;

public class Jugador {
    private int id;

    private String nombre;

    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, boolean mojado) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = mojado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return this.mojado;
    }

    public boolean getMojado() {
        return this.mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Jugador id(int id) {
        setId(id);
        return this;
    }

    public Jugador nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Jugador mojado(boolean mojado) {
        setMojado(mojado);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Jugador)) {
            return false;
        }
        Jugador jugador = (Jugador) o;
        return id == jugador.id && Objects.equals(nombre, jugador.nombre) && mojado == jugador.mojado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, mojado);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nombre='" + getNombre() + "'" + ", mojado='" + isMojado() + "'" + "}";
    }

}
