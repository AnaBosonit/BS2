package com.example.BS2;

import org.springframework.stereotype.Service;

import java.util.List;


public interface CiudadService {

    //Ciudad addCiudad(Ciudad ciudad);
    //List<Ciudad> getCiudades();
    String getNombre();
    int getNumeroHabitantes();

    void setNumeroHabitantes(int i);

    void setNombre(String nombre);

    public Ciudad addCiudad(Ciudad ciudad);

    List<Ciudad> getCiudadList();


    String toString();




}
