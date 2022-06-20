package test;
import domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Cesar Emilio", 45785.69, false );
        System.out.println(persona1.getNombre());
        persona1.setNombre("Cesar Emilio Barba Pulido");
        System.out.println("Persona1 nombre: " + persona1.getNombre());
        System.out.println("Persona1 sueldo: $" + persona1.getSueldo());
        System.out.println("Persona1 eliminado: " + persona1.isEliminado() + "\n");

        System.out.println("Persona1: " + persona1.toString());
        System.out.println("persona1 = " + persona1); //println ya tiene de manera automatica el toString
    }
}
