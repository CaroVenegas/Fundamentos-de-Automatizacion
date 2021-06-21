package com.ucreativa.proyecto.entities;

public abstract class Utencilios {
    private  String nombre;

    public Utencilios(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
