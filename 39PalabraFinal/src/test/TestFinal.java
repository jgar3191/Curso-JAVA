package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 15;
        System.out.println("miVariable = " + miVariable);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona();
        persona1.setNombre("Bob");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        persona1.setNombre("Cesar");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
    }
}
