
package com.ucreativa.proyecto.services;

import com.ucreativa.proyecto.entities.Ingredientes;
import com.ucreativa.proyecto.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;
    private recetas ingredientes;
    private Ingredientes ingrediente;

    public BitacoraService(Repository repository) {
        this.repository = repository;
    }

    public BitacoraService(String nombre, String marca, Date fecha) {
    }

    public void save(String nombre, String cedula, String txtEdad,
                     boolean riesgo, boolean isAmigo, String relacion,
                     String facebook, String parentesco, String marca) {
        try {
        Ingredientes ingredientes }
        if (isAmigo) {
            ingredientes = new recetas (nombre, marca,);
        } else
            .repository.save(ingrediente, marca, new Date());
    }

    public List<String> get() {
        return this.repository.get();
    }

    private class recetas {
        public recetas(String nombre, String marca,) {
        }
    }
}