public class Variables {
    public static void main(String[] args) {
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        //String no es un tipo primitivo sino una clase de JAVA
        String miVariableCadena = "Hola";
        System.out.println(miVariableCadena);

        //Modificamos el valor de miVariableCadena
        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);

        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Hello";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        System.out.println("miVariableEntera2 = " + miVariableEntera2);

        //Valores permitidos en el nombre de las variables
        var miVaraible = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        // var áVariable = 4; Posible pero no recomendado
        // var #miVariable = 2; No se permite utilizar caracteres especiales
    }
}
