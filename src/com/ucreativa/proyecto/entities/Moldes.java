package com.ucreativa.proyecto.entities;

public class Moldes extends Utencilios{
    private String tamano;
    private String forma;
    public Moldes(String nombre, String tamano, String forma) {
        super(nombre);
        this.tamano = tamano;
        this.forma = forma;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}
