package com.bravi.Ejercicio2Alternativa;

import java.util.ArrayList;
import java.util.Scanner;

import com.bravi.Ejercicio2Alternativa.Model.Juego;
import com.bravi.Ejercicio2Alternativa.Model.Jugador;
import com.bravi.Ejercicio2Alternativa.Model.Revolver;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidadJugadores = Integer.valueOf(scan.nextLine());
        if (cantidadJugadores > 6) {
            cantidadJugadores = 6;
        }
        for (int i = 1; i <= cantidadJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
        System.out.println(jugadores);
        Revolver r = new Revolver();
        r.getService().llenarRevolver();
        Juego juego = new Juego();
        juego.getService().llenarJuego(jugadores, r);
        for (int i = 0; i < cantidadJugadores; i++) {
            juego.getService().ronda(juego.getJugadores().get(i), r);
            if (juego.getJugadores().get(i).getMojado()) {
                return;
            }
        }
    }
}
