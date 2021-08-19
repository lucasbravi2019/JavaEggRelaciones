package com.bravi.Ejercicio3.Model;

import java.util.Objects;

import com.bravi.Ejercicio3.Service.CartaService;

public class Carta {
    private int numero;

    private String palo;

    private CartaService service;

    public Carta() {
        this.service = new CartaService(this);
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
        this.service = new CartaService(this);
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

    public CartaService getService() {
        return this.service;
    }

    public void setService(CartaService service) {
        this.service = service;
    }

    public Carta numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Carta palo(String palo) {
        setPalo(palo);
        return this;
    }

    public Carta service(CartaService service) {
        setService(service);
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
        return numero == carta.numero && Objects.equals(palo, carta.palo) && Objects.equals(service, carta.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, palo, service);
    }

    @Override
    public String toString() {
        return "{" + " numero='" + getNumero() + "'" + ", palo='" + getPalo() + "'" + ", service='" + getService() + "'"
                + "}";
    }
}
