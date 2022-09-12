package com.example.BS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//Esta etiqueta indica que la clase va a servir para atender a peticiones web
public class Controlador2 {

    @Autowired
    PersonaService personaService;






    @Autowired
    CiudadService ciudadService;
    @Autowired
    List<CiudadService> ciudadServiceList;


    //los autowired siempre se hacen de interfaces, nunca de clases

    @GetMapping
    String holaMundoSinName(){
        return "Hola, mundo ";
    }
    /*En otra clase, crear el Controlador2, en la URL /controlador2/getPersona
     tiene que devolver el objeto Persona recibido en el Controlador1, multiplicando la edad por dos*/

    @GetMapping("/controlador2/getPersona")

    public PersonaService getPersona(){
        personaService.setAge(Integer.parseInt(personaService.getAge())*2);
        System.out.println("Edad por dos: " + personaService.getAge());
        return personaService;
    }
    //En controlador2, en la URL /controlador1/getCiudad, petición tipo GET,
    // se devolverá la lista de las ciudades existentes.

    @GetMapping("/controlador2/getCiudad")
    public List<Ciudad> getCiudad(){
        return ciudadService.getCiudadList();

    }


}
