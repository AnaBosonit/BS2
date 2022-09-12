package com.example.BS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService{


    Persona persona = new Persona();

    @Override
    public String getName() {
        return persona.getName();
    }



    @Override
    public String getAge() {
        return String.valueOf(persona.getAge());
    }

    @Override
    public String getCity() {
        return persona.getCity();
    }

    @Override
    public void setAge(int i) {
        persona.setAge(i);


    }

    @Override
    public void setCity(String poblacion) {
        persona.setCity(poblacion);

    }

    @Override
    public void setName(String nombre) {
        persona.setName(nombre);

    }


}
