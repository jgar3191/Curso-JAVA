import java.util.Scanner;

public class ConversionTipos {
    public static void main(String[] args) {
        //Convertir String a int
        var edad = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad + 1= " + (edad + 1));

        //Convertir String a Double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor
        var consola = new Scanner(System.in);
        /*
        System.out.println("Proporciona tu edad");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
         */

        //Convertir int a String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "Hola".charAt(1);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un carcater");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
