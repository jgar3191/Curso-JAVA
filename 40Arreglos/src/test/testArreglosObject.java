package test;

import domain.Persona;

public class testArreglosObject {
    public static void main(String[] args) {
         Persona personas[] = new Persona[2 ];
         personas[0] = new Persona("Jorge");
         personas[1] = new Persona("Cesar");

        System.out.println("Personas 0: " + personas[0]);
        System.out.println("Personas 1: " + personas[1].getNombre());

        for(int i = 0; i < personas.length; i++){
            System.out.println("Personas "+ i + ": " + personas[i]);
        }

        String frutas[] = {"Uva", "Fresa", "Platano"};

        for (int i = 0; i < frutas.length; i++){
            System.out.println("frutas = " + frutas[i]);
        }

    }
}
