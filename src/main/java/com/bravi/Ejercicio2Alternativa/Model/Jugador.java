package com.bravi.Ejercicio2Alternativa.Model;

import java.util.Objects;

import com.bravi.Ejercicio2Alternativa.Service.JugadorService;

public class Jugador {
    private int id;

    private String nombre;

    private boolean mojado;

    private JugadorService service;

    public Jugador() {
        this.service = new JugadorService(this);
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
        this.service = new JugadorService(this);
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

    public JugadorService getService() {
        return this.service;
    }

    public void setService(JugadorService service) {
        this.service = service;
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

    public Jugador service(JugadorService service) {
        setService(service);
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
        return id == jugador.id && Objects.equals(nombre, jugador.nombre) && mojado == jugador.mojado
                && Objects.equals(service, jugador.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, mojado, service);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nombre='" + getNombre() + "'" + ", mojado='" + isMojado() + "'"
                + ", service='" + getService() + "'" + "}";
    }

}
