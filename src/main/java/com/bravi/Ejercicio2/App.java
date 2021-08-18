package com.bravi.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

import com.bravi.Ejercicio2.Model.Juego;
import com.bravi.Ejercicio2.Model.Jugador;
import com.bravi.Ejercicio2.Model.RevolverAgua;
import com.bravi.Ejercicio2.Service.JuegoService;
import com.bravi.Ejercicio2.Service.RevolverAguaService;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        JuegoService s = new JuegoService();
        System.out.println("Indique la cantidad de jugadores");
        int numeroJugadores = Integer.valueOf(scan.nextLine());
        if (numeroJugadores > 6) {
            numeroJugadores = 6;
        }
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        for (int i = 0; i < numeroJugadores; i++) {
            jugadores.add(new Jugador(i + 1, false));
        }
        RevolverAgua r = new RevolverAgua();
        RevolverAguaService rS = new RevolverAguaService();
        rS.llenarRevolver(r);
        Juego j = s.llenarJuego(jugadores, r);
        s.jugar(j);
        System.out.println(j);
    }
}
