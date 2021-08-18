package com.bravi.Ejercicio1.Model;

import java.util.Objects;

public class Perro {
    private String nombre;

    private String raza;

    private int edad;

    private String tamaño;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Perro nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Perro raza(String raza) {
        setRaza(raza);
        return this;
    }

    public Perro edad(int edad) {
        setEdad(edad);
        return this;
    }

    public Perro tamaño(String tamaño) {
        setTamaño(tamaño);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Perro)) {
            return false;
        }
        Perro perro = (Perro) o;
        return Objects.equals(nombre, perro.nombre) && Objects.equals(raza, perro.raza) && edad == perro.edad
                && Objects.equals(tamaño, perro.tamaño);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, raza, edad, tamaño);
    }

    @Override
    public String toString() {
        return "{" + " nombre='" + getNombre() + "'" + ", raza='" + getRaza() + "'" + ", edad='" + getEdad() + "'"
                + ", tamaño='" + getTamaño() + "'" + "}";
    }

}
