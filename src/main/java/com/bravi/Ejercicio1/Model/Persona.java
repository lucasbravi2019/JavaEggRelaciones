package com.bravi.Ejercicio1.Model;

import java.util.Objects;

public class Persona {
    private String nombre;

    private String apellido;

    private int edad;

    private int documento;

    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellido;
    }

    public void setApellidos(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return this.documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return this.perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Persona apellido(String apellido) {
        setApellidos(apellido);
        return this;
    }

    public Persona edad(int edad) {
        setEdad(edad);
        return this;
    }

    public Persona documento(int documento) {
        setDocumento(documento);
        return this;
    }

    public Persona perro(Perro perro) {
        setPerro(perro);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido)
                && edad == persona.edad && documento == persona.documento && Objects.equals(perro, persona.perro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, edad, documento, perro);
    }

    @Override
    public String toString() {
        return "{" + " nombre='" + getNombre() + "'" + ", apellido='" + getApellidos() + "'" + ", edad='" + getEdad()
                + "'" + ", documento='" + getDocumento() + "'" + ", perro='" + getPerro() + "'" + "}";
    }
}
