package com.example.BS2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Bs2Application {

	public static void main(String[] args) {
		SpringApplication.run(Bs2Application.class, args);
	}
/*
	@Bean
	public List<CiudadService> getCiudadList(){
		List<CiudadService> ciudadServiceList = new ArrayList<>();
		return ciudadServiceList;
	}*/
/*
	@Bean
	@Qualifier("personaService1")
	public PersonaService getPerson() {
		PersonaService personaService = new PersonaServiceImpl();
		return personaService;

	}
	*/
	@Bean
	@Qualifier("bean1")
	public Persona primeraFuncion(){
		Persona bean1 = new Persona();
		bean1.setName("bean1");
		return bean1;
	}

	@Bean
	@Qualifier("bean2")
	public Persona segundaFuncion(){
		Persona bean2 = new Persona();
		bean2.setName("bean2");
		return bean2;
	}

	@Bean
	@Qualifier("bean3")
	public Persona terceraFuncion(){
		Persona bean3 = new Persona();
		bean3.setName("bean3");
		return bean3;
	}
	/*
	* Crear 3 objetos Persona diferentes con funciones que tengan la etiqueta @Bean.
	* La primera función pondrá el nombre a ‘bean1’, el segundo a “bean2” y el tercero a “bean3”. Usar @Qualifiers
*/

}
