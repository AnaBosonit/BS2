package com.example.BS2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadServiceImpl implements CiudadService {
    Ciudad ciudad = new Ciudad();
    List<Ciudad> ciudadList = new ArrayList<>();

    public CiudadServiceImpl(){};
    @Override
    public String getNombre() {
        return ciudad.getNombre();
    }

    @Override
    public int getNumeroHabitantes() {
        return ciudad.getNumeroHabitantes();
    }

    @Override
    public void setNumeroHabitantes(int i) {
        ciudad.setNumeroHabitantes(i);

    }

    @Override
    public void setNombre(String nombre) {
        ciudad.setNombre(nombre);

    }

    @Override
    public Ciudad addCiudad(Ciudad ciudad) {
        ciudadList.add(ciudad);
        return ciudad;
    }

    @Override
    public List<Ciudad> getCiudadList() {
        return ciudadList;
    }

    /*
    public Ciudad addCiudad(Ciudad ciudad){
        ciudadList.add(ciudad);
        return ciudad;
    };*/


/*
    public List<Ciudad> getCiudades(){
        return ciudadList;
    };*/

    @Override
    public String toString(){
        return "Nombre: " + this.getNombre() + " - Habitantes: " + this.getNumeroHabitantes();
    }
}
