package com.example.BS2;

import lombok.Data;

@Data
public class Ciudad {
    String nombre;
    int numeroHabitantes;

    public Ciudad(String nombre, int numeroHabitantes){
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
    }

    public Ciudad() {

    }

    //@Bean es lo mismo que hemos hecho perto en vex de con una clase, con una funcion
}
