package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes de tipos primitivos o Wrapper
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
         */

        //AUTOBOXING - envolvemos el tipo primitivo en un tipo object
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero.toString() = " + entero.toString());
        System.out.println("entero.doubleValue() = " + entero.doubleValue());

        //UNBOXING - se extrae la literal o valor primitivo almacenado en tipo object
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}
