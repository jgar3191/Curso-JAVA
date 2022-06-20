package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {

        int edades[] = {5,6,8,9};

        //for Mejorado
        //Tipo variable a guardar y arreglo a recorrer
        for (int edad: edades) {
            System.out.println("Edad = " + edad);
        }

        Persona personas[] = {new Persona("Cesar"), new Persona("Emilio"), new Persona("Jorge")};
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }


    }
}
