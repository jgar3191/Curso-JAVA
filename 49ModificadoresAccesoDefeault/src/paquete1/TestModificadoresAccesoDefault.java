package paquete1;

//En Default o Package todo debe estar en el mismo paquete

public class TestModificadoresAccesoDefault {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        clase1.atributoDefault = "Cambio desde la prueba";
        System.out.println("clase1 atributo default = " + clase1.atributoDefault);
        clase1.metodoDefault();
    }
}
