package com.bravi.Ejercicio3.Service;

import java.util.ArrayList;

import com.bravi.Ejercicio3.Model.Baraja;
import com.bravi.Ejercicio3.Model.Carta;

public class BarajaService {
    private Baraja baraja;

    public BarajaService(Baraja baraja) {
        this.baraja = baraja;
    }

    public void llenarBaraja() {
        ArrayList<Carta> cartas = new ArrayList<Carta>();
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > 7) {
                    if (j == 0) {
                        cartas.add(new Carta(i + 2, "Espada"));
                    }
                    if (j == 1) {
                        cartas.add(new Carta(i + 2, "Basto"));
                    }
                    if (j == 2) {
                        cartas.add(new Carta(i + 2, "Oro"));
                    }
                    if (j == 3) {
                        cartas.add(new Carta(i + 2, "Copa"));
                    }
                } else {

                    if (j == 0) {
                        cartas.add(new Carta(i, "Espada"));
                    }
                    if (j == 1) {
                        cartas.add(new Carta(i, "Basto"));
                    }
                    if (j == 2) {
                        cartas.add(new Carta(i, "Oro"));
                    }
                    if (j == 3) {
                        cartas.add(new Carta(i, "Copa"));
                    }
                }
            }
        }
        baraja.setBaraja(cartas);
    }

    public void barajar() {
        for (int i = 0; i < 40; i++) {
            int index = (int) (Math.random() * 40);
            Carta cartaCambiada = baraja.getBaraja().get(index);
            Carta cartaCambiada2 = baraja.getBaraja().get(i);
            baraja.getBaraja().set(i, cartaCambiada);
            baraja.getBaraja().set(index, cartaCambiada2);
        }
    }

    public Carta siguienteCarta() {
        return baraja.getBaraja().get(0);
    }

    public int cartasDisponibles() {
        return baraja.getBaraja().size();
    }

    public ArrayList<Carta> darCartas(int cartas) {
        ArrayList<Carta> darCartas = new ArrayList<Carta>();
        for (int i = 0; i < cartas; i++) {
            darCartas.add(baraja.getBaraja().get(i));
        }
        return darCartas;
    }

    public void mostrarBaraja(ArrayList<Carta> cartasDadas) {
        int i = 0;
        ArrayList<Carta> cartas = baraja.getBaraja();
        if (cartasDadas.size() > 0) {
            while (i < cartasDadas.size()) {
                if (cartas.get(0) == cartasDadas.get(i)) {
                    cartas.remove(0);
                }
                i++;
            }
        }
        baraja.setBaraja(cartas);
    }

}
