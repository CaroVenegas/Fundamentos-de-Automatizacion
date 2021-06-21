package com.ucreativa.proyecto.entities;

public class Recetas extends Ingredientes{
    private String nombre;
    private String marca;
    public Recetas(String nombre, String marca, String nombre1, String marca1) {

        this.nombre = nombre1;
        this.marca = marca1;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
