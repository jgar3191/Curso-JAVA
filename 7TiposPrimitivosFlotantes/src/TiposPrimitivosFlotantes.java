public class TiposPrimitivosFlotantes {
    public static void main(String[] args) {
        /*
            Tipos Primitivos de Tipo Flotante: Float y Double
        */

        //FLOAT
        float numFloat = 10.0F; //Se debe usar la literal F para que reconozca el compilador que es flotante
        float numFloat2 = (float) 10.0; //Otra forma
        float numFloat3 = (float) 3.4028235E39D; //Conversion a Double pero float no soporta por eso manda Infinity
        System.out.println("numFloat = " + numFloat);
        System.out.println("numFloat2 = " + numFloat2);
        System.out.println("numFloat3 = " + numFloat3);
        System.out.println("Valor minimo de tipo float: " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("Valor maximo de tipo float: " + Float.MAX_VALUE); // 3.4028235E38

        //DOUBLE
        double numDouble = 1.7976931348623157E308; //Se puede poner la literal D pero por ser de tipo Double JAVA ya lo reconoce
        System.out.println("\nnumDouble = " + numDouble);
        System.out.println("Valor minimo de tipo Double: " + Double.MIN_VALUE); // 4.9E-324
        System.out.println("Valor maximo de tipo Double: " + Double.MAX_VALUE); // 1.7976931348623157E308

    }
}
