package test;

import domain.*;

public class TestPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        //System.out.println("Empleado = " + empleado.obtenerDetalles());

        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
        //System.out.println("Gerente = " +gerente.obtenerDetalles());

        imprimirDetalles(empleado);
        imprimirDetalles(gerente);

    }

    public static void imprimirDetalles(Empleado empleado){
        System.out.println("Empleado: " + empleado.obtenerDetalles());
    }
}
