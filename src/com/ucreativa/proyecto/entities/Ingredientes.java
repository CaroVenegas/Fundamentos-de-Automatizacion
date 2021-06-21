package com.ucreativa.proyecto.entities;

import java.util.Date;

public class Ingredientes {

    private String nombre;
    public Date fecha;

    public Ingredientes(String nombre, String marca, Date fecha) {
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFecha() { return fecha; }

    public void setFecha(Date fecha) { this.fecha = fecha; }

}
