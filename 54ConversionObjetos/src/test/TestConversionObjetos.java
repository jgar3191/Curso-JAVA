package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000.00, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);

        //System.out.println(empleado.obtenerDetalles());
        //DownCasting - Convertir una referencia de tipo padre a tipo hijo
        //((Escritor) empleado).getTipoEscritura(); //Sintaxis Tipo 1

        Escritor escritor = (Escritor) empleado; //Sintaxis Tipo 2
        escritor.getTipoEscritura();

        //UpCasting - Asignar una variable de tipo hija a tipo Padre
        Empleado empleado2 = escritor;
        empleado2.obtenerDetalles();
        System.out.println(empleado2.obtenerDetalles());

    }
}
