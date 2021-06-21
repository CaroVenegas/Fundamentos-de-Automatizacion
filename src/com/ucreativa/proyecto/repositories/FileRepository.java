package com.ucreativa.proyecto.repositories;

import com.ucreativa.proyecto.entities.Ingredientes;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileRepository implements Repository{

    private final String FILE_PATH = "db.txt";
    private Object append;
    private Object e;

    @Override
    public List<String> save(Ingredientes ingredientes, String marca, Date fecha) {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        String text = ingredientes.getNombre() +""+ marca + "" + format.format(fecha) +"n";
        try {
            BufferedWriter writer = new BufferedWriter(new FilterWriter(FILE_PATH, append:true));
            {
                writer.append(text);
                writer.close();

            } catch(IOExceptione){
                e.void;
        }
    } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        @Override
        public List<String> get(){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
                return reader.lines().collect(Collectors.toList());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    private class IOExceptione {
    }

