package com.bravi.Ejercicio1.Service;

import java.util.Scanner;

import com.bravi.Ejercicio1.Model.Perro;
import com.bravi.Ejercicio1.Model.Persona;

public class PersonaService {
    Scanner scan = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String personaNombre = scan.nextLine();
        System.out.println("Ingrese el apellido de la persona");
        String personaApellido = scan.nextLine();
        System.out.println("Ingrese la edad de la persona");
        int personaEdad = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese el documento de la persona");
        int personaDocumento = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese el nombre del perro");
        String perroNombre = scan.nextLine();
        System.out.println("Ingrese el raza del perro");
        String perroRaza = scan.nextLine();
        System.out.println("Ingrese la edad del perro");
        int perroEdad = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese el tamaño del perro");
        String perroTamaño = scan.nextLine();
        return new Persona(personaNombre, personaApellido, personaEdad, personaDocumento,
                new Perro(perroNombre, perroRaza, perroEdad, perroTamaño));
    }

}
