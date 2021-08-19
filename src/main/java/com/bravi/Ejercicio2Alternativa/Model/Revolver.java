package com.bravi.Ejercicio2Alternativa.Model;

import java.util.Objects;

import com.bravi.Ejercicio2Alternativa.Service.RevolverService;

public class Revolver {
    private int posicionActual;

    private int posicionAgua;

    private RevolverService service;

    public Revolver() {
        this.service = new RevolverService(this);
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
        this.service = new RevolverService(this);
    }

    public int getPosicionActual() {
        return this.posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return this.posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public RevolverService getService() {
        return this.service;
    }

    public void setService(RevolverService service) {
        this.service = service;
    }

    public Revolver posicionActual(int posicionActual) {
        setPosicionActual(posicionActual);
        return this;
    }

    public Revolver posicionAgua(int posicionAgua) {
        setPosicionAgua(posicionAgua);
        return this;
    }

    public Revolver service(RevolverService service) {
        setService(service);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Revolver)) {
            return false;
        }
        Revolver revolver = (Revolver) o;
        return posicionActual == revolver.posicionActual && posicionAgua == revolver.posicionAgua
                && Objects.equals(service, revolver.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posicionActual, posicionAgua, service);
    }

    @Override
    public String toString() {
        return "{" + " posicionActual='" + getPosicionActual() + "'" + ", posicionAgua='" + getPosicionAgua() + "'"
                + ", service='" + getService() + "'" + "}";
    }

}
