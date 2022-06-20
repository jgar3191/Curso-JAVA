import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int calificacion;
        char calificacionLetra = 'X';

        System.out.println("Introduzca su calificacion");
        calificacion = Integer.parseInt(scan.nextLine());

        if (calificacion >= 9 && calificacion <= 10) {
            calificacionLetra = 'A';
        }
        else if (calificacion >= 8 && calificacion < 9){
            calificacionLetra = 'B';
        }
        else if(calificacion >= 7 && calificacion < 8){
            calificacionLetra = 'C';
        }
        else if(calificacion >= 6 && calificacion < 7){
            calificacionLetra = 'D';
        }
        else if(calificacion >= 0 && calificacion < 6){
            calificacionLetra = 'F';
        }
        else System.out.println("Valor Desconocido");

        System.out.println("calificacionLetra = " + calificacionLetra);
    }
}
