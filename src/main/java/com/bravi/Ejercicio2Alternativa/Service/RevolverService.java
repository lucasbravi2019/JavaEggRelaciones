package com.bravi.Ejercicio2Alternativa.Service;

import com.bravi.Ejercicio2Alternativa.Model.Revolver;

public class RevolverService {
    private Revolver revolver;

    public RevolverService(Revolver revolver) {
        this.revolver = revolver;
    }

    public void llenarRevolver() {
        revolver.setPosicionActual(1);
        revolver.setPosicionAgua((int) (Math.random() * 6));
    }

    public boolean mojar() {
        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) {
            return true;
        }
        return false;
    }

    public void siguienteChorro() {
        revolver.setPosicionActual(revolver.getPosicionActual() + 1);
    }

}
