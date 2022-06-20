package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAccesoProtected {
    public static void main(String[] args) {
        //Clase1 clase1 = new Clase1("Publico ");
        //System.out.println("clase1. = " + clase1.atrib);
        //clase1.metodoPublico();

        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
    }
}
