package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;

    public static void main(String[] args) {
        Persona persona1 = new Persona("Cesar");
        //System.out.println("Persona 1: " + persona1);

        Persona persona2 = new Persona("Rodrigo");
        //System.out.println("persona 2: " + persona2);

        imprimir(persona1);
        imprimir(persona2);

        PersonaPrueba per = new PersonaPrueba();
        per.getContador();
    }

    public static void imprimir(Persona persona){
        System.out.println("Persona = " + persona);
    }

    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;
    }

}
