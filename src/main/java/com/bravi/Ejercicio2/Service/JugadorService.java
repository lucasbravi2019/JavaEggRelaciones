package com.bravi.Ejercicio2.Service;

import com.bravi.Ejercicio2.Model.Jugador;
import com.bravi.Ejercicio2.Model.RevolverAgua;

public class JugadorService {
    RevolverAguaService rS = new RevolverAguaService();

    public void disparo(Jugador j, RevolverAgua r) {
        if (!j.getMojado()) {
            j.setMojado(rS.mojar(r));
        }
    }

}
