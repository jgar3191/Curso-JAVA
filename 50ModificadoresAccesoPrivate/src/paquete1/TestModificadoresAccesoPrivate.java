package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoresAccesoPrivate {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("publico");
        //clase1.atributoPrivado = "Cambio"; No se puede así, hay que usar get y set
        clase1.setAtributoPrivado("Cambio");
        System.out.println("Atributo Privado = " + clase1.getAtributoPrivado());
    }
}
