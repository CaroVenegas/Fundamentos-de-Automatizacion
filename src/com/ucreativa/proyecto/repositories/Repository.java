package com.ucreativa.proyecto.repositories;

import com.ucreativa.proyecto.entities.Ingredientes;

import java.util.Date;
import java.util.List;

public interface Repository {
    List<String> save(Ingredientes ingredientes, String marca, Date fecha );

    List<String> get();
}
