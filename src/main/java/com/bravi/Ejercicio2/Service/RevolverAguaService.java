package com.bravi.Ejercicio2.Service;

import com.bravi.Ejercicio2.Model.RevolverAgua;

public class RevolverAguaService {

    public void llenarRevolver(RevolverAgua r) {
        r.setPosicionAgua((int) (Math.random() * 6));
        r.setPosicionActual(1);
    }

    public boolean mojar(RevolverAgua r) {
        if (r.getPosicionActual() == r.getPosicionAgua()) {
            return true;
        }
        return false;
    }

    public void siguienteChorro(RevolverAgua r) {
        r.setPosicionActual(r.getPosicionActual() + 1);
    }

}
