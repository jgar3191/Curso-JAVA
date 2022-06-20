import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
        numeros();
        estaciones();
    }

    private static void estaciones() {
        Scanner scan = new Scanner(System.in);
        int mes;
        var estacion = "Estacion desconocida";

        System.out.println("Escribe el numero del mes");
        mes = Integer.parseInt(scan.nextLine());

        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Otonio";
        }

        System.out.println("estacion = " + estacion);
    }

    private static void numeros() {
        var numero = 8;
        var numeroTexto = "Numero Desconocido";

        if(numero == 1){
            numeroTexto = "Numero 1";
        }
        else if (numero == 2){
            numeroTexto = "Numero 2";
        }
        else if (numero == 3){
            numeroTexto = "Numero 3";
        }
        else if(numero == 4){
            numeroTexto = "Numero 4";
        }
        //  else numeroTexto = "Numero no encontrado";

        System.out.println("numeroTexto = " + numeroTexto);
    }
}
