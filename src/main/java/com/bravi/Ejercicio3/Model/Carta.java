package com.bravi.Ejercicio3.Model;

import java.util.Objects;

public class Carta {
    private int numero;

    private String palo;

    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return this.palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Carta numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Carta palo(String palo) {
        setPalo(palo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carta)) {
            return false;
        }
        Carta carta = (Carta) o;
        return numero == carta.numero && Objects.equals(palo, carta.palo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, palo);
    }

    @Override
    public String toString() {
        return "{" + " numero='" + getNumero() + "'" + ", palo='" + getPalo() + "'" + "}";
    }

}
