package com.example.BS2;

import org.springframework.beans.factory.annotation.Autowired;

public interface PersonaService {

    String getName();
    String getAge();
    String getCity();

    void setAge(int i);

    void setCity(String poblacion);

    void setName(String nombre);


}
