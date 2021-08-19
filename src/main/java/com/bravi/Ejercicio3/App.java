package com.bravi.Ejercicio3;

import java.util.ArrayList;

import com.bravi.Ejercicio3.Model.Baraja;
import com.bravi.Ejercicio3.Model.Carta;

public class App {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.getService().llenarBaraja();
        for (Carta carta : baraja.getBaraja()) {
            System.out.println(carta);
        }
        baraja.getService().barajar();
        System.out.println("Barajando...");
        for (Carta carta : baraja.getBaraja()) {
            System.out.println(carta);
        }
        ArrayList<Carta> cartasDadas = new ArrayList<Carta>();
        System.out.println("Cartas dadas");
        cartasDadas.addAll(baraja.getService().darCartas(5));
        if (cartasDadas.size() > 0) {
            System.out.println("Las cartas que salieron son: ");
            for (Carta carta : cartasDadas) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No han salido cartas aun");
        }
        System.out.println("La baraja que queda es: ");
        baraja.getService().mostrarBaraja(cartasDadas);
        for (Carta carta : baraja.getBaraja()) {
            System.out.println(carta);
        }
    }
}
