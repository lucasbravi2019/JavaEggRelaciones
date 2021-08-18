package com.bravi.Ejercicio2.Model;

import java.util.Objects;

public class RevolverAgua {
    private int posicionActual;

    private int posicionAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
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

    public RevolverAgua posicionActual(int posicionActual) {
        setPosicionActual(posicionActual);
        return this;
    }

    public RevolverAgua posicionAgua(int posicionAgua) {
        setPosicionAgua(posicionAgua);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RevolverAgua)) {
            return false;
        }
        RevolverAgua revolverAgua = (RevolverAgua) o;
        return posicionActual == revolverAgua.posicionActual && posicionAgua == revolverAgua.posicionAgua;
    }

    @Override
    public int hashCode() {
        return Objects.hash(posicionActual, posicionAgua);
    }

    @Override
    public String toString() {
        return "{" + " posicionActual='" + getPosicionActual() + "'" + ", posicionAgua='" + getPosicionAgua() + "'"
                + "}";
    }

}
