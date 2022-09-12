package com.example.BS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
//Esta etiqueta indica que la clase va a servir para atender a peticiones web
public class Controlador1 {

    /*
     * En Controlador1, en la URL /controlador1/addPersona, tipo GET,
     * en los headers tiene que recibir, el nombre, población y edad.
     * Utilizando una clase de servicio, se creará un objeto Persona.
     * La llamada devolverá el objeto Persona creado.*/


    @Autowired
    PersonaService personaService;

    @Autowired
    CiudadService ciudadService;

    @Autowired
    List<CiudadService> ciudadServiceList;

    /*
    @Autowired
    @Qualifier("bean1")
    PersonaService ps1;

    @Autowired
    @Qualifier("bean2")
    PersonaService ps2;

    @Autowired
    @Qualifier("bean3")
    PersonaService ps3;

     */

    //Spring ve el autowired de PersonaService y dice "necesito un objeto de PersonaService"
    //pero como es una interfaz, busca una clase que implemente esa interfaz y si encuentra alguna que tenga
    //@Component o @Service, hace un new de esa clase y la devuelve

    //El  @Autowired
    //    PersonaService personaService;
    //es equivalente a :

    /*
    public Controlador1(PersonaService personaService){
        this.personaService = personaService;
    }*/

    //Cuando SpringBoot encuentre esto de @Autowired busca en su entorno algo que tenga guardado por @Component
    //que se ajuste (en este caso, el @Component en la clase Persona, que hacía un new Persona) y lo iguala a ello
    //Ponemos @Autowired de Persona en controlador2 tb y el objeto Persona es el mismo


    @GetMapping("controlador1/addPersona")
    PersonaService addPersona(@RequestHeader Map<String, String> headers) {
        personaService.setName(headers.get("nombre"));
        personaService.setCity(headers.get("poblacion"));
        personaService.setAge(Integer.parseInt(headers.get("edad")));

        return personaService;
    }

    //En controlador1, en la URL /controlador1/addCiudad, petición tipo POST, se añadirá una ciudad a la lista.

    @PostMapping("controlador1/addCiudad")
    public void addCiudad(@RequestBody Ciudad ciudad) {
        //System.out.println(ciudadService.getNombre());
        //System.out.println(ciudadService.getNumeroHabitantes());
        String name = ciudad.getNombre();
        int num = ciudad.getNumeroHabitantes();

        ciudadService.addCiudad(ciudad);
        System.out.println(ciudadService.getCiudadList());

    }

    /*En un controlador con la URL /controlador/bean/{bean} dependiendo
     * del parámetro mandado devolver cada uno de los Beans. Asi: /controlador/bean/bean1 devolverá
     * el objeto cuyo nombre sea bean1 y así sucesivamente.*/
    /*
    @GetMapping("/controlador/bean/{bean}")
    public PersonaService returnPersonaBean(@PathVariable String bean) {
        PersonaService ps;
        switch (bean) {
            case "bean1":
                ps = ps1;
                break;

            case "bean2":
                ps = ps2;
                break;
            case "bean3":
                ps = ps3;
                break;
            default:
                ps = personaService;
        }
        return ps;
    }
*/

}
