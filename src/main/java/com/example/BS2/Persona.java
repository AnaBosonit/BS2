package com.example.BS2;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//Con la etiqueta Compònen, cuando arranque el programa, Spring va a hacer un new Persona
//Y se la va a guardar
//Si desde controlador quiero acceder a esa Persona,  uso @autowired
//@Service
@Data
public class Persona {
    String name;
    String city;
    int age;

    public Persona(String name, String city, Integer age) {
    }

    public Persona() {

    }
}
