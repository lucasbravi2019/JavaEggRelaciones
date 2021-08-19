package com.bravi.Ejercicio2Alternativa.Service;

import com.bravi.Ejercicio2Alternativa.Model.Jugador;
import com.bravi.Ejercicio2Alternativa.Model.Revolver;

public class JugadorService {
    private Jugador jugador;

    public JugadorService(Jugador j) {
        this.jugador = j;
    }

    @Override
    public String toString() {
        return "{" + " jugador='" + jugador.getNombre() + "'" + "}";
    }

    public void disparo(Revolver r) {
        if (r.getService().mojar()) {
            jugador.setMojado(true);
            System.out.println("El " + jugador.getNombre() + " pierde");
        } else {
            r.getService().siguienteChorro();
            System.out.println("Se salvo!");
        }
    }

}
