package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("juan", 5000);

        //Por el uso de new se sabe que tienen diferente refecnia en memoria aunque el contenido sea el mismo
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }
        else {
            System.out.println("Tienen distinta referencia en memoria");
        }
        if (empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        }
        else {
            System.out.println("Los objetos son diferentes en contenido");
        }

        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor de haschcode es igual");
        }
        else {
            System.out.println("El valor hashcode es distinto");
        }
    }
}
