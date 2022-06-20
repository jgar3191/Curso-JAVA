import java.util.Scanner;

public class ClaseScanner {
    public static void main(String []args){
        System.out.println("Escribe tu nombre:");
        Scanner scan = new Scanner(System.in);
        var usuario = scan.nextLine();
        System.out.println("Usuario: " + usuario);
        System.out.println("Escribe el titulo:");
        var titulo = scan.nextLine();
        System.out.println("Titulo: " + titulo + " " + usuario);
    }
}
