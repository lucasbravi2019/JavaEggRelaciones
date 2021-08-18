package com.bravi.Ejercicio1;

import java.util.ArrayList;

import com.bravi.Ejercicio1.Model.Persona;
import com.bravi.Ejercicio1.Service.PersonaService;

public class App {
    public static void main(String[] args) {
        PersonaService s = new PersonaService();
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(s.crearPersona());
        personas.add(s.crearPersona());
        System.out.println(personas);
    }
}
