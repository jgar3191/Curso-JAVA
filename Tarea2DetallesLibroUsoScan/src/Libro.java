import java.util.Scanner;

public class Libro {
    public static void main(String []args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el titulo de un libro");
        var tituloLibro = leer.nextLine();
        System.out.println("Escribe el nombre del autor del libro");
        var autorLibro = leer.nextLine();
        System.out.println(tituloLibro + " fue escrito por " + autorLibro);
    }
}
