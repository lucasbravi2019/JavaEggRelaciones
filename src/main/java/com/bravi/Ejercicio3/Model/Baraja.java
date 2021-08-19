package com.bravi.Ejercicio3.Model;

import java.util.ArrayList;
import java.util.Objects;

import com.bravi.Ejercicio3.Service.BarajaService;

public class Baraja {
    private ArrayList<Carta> baraja;

    private BarajaService service;

    public Baraja() {
        this.service = new BarajaService(this);
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
        this.service = new BarajaService(this);
    }

    public ArrayList<Carta> getBaraja() {
        return this.baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public BarajaService getService() {
        return this.service;
    }

    public void setService(BarajaService service) {
        this.service = service;
    }

    public Baraja baraja(ArrayList<Carta> baraja) {
        setBaraja(baraja);
        return this;
    }

    public Baraja service(BarajaService service) {
        setService(service);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Baraja)) {
            return false;
        }
        Baraja baraja = (Baraja) o;
        return Objects.equals(baraja, baraja.baraja) && Objects.equals(service, baraja.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baraja, service);
    }

    @Override
    public String toString() {
        return "{" + " baraja='" + getBaraja() + "'" + ", service='" + getService() + "'" + "}";
    }

}
