import java.util.Scanner;

public class TiendaDeLibros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Nombre del libro:");
        String nombreLibro = consola.nextLine();
        System.out.println("ID del libro:");
        int id = Integer.parseInt(consola.nextLine());
        System.out.println("Precio del libro:");
        double precioLibro = Double.parseDouble(consola.nextLine());
        System.out.println("Tiene envio gratuito:");
        //boolean envioGratis2 = Boolean.parseBoolean(consola.nextLine());
        char envioGratis1 = consola.nextLine().toLowerCase().charAt(0);
        boolean envioGratis2;

        if (envioGratis1 == 's'){
            envioGratis2 = true;
        } else {
            envioGratis2 = false;
        }

        System.out.println("\nInformación del Libro\n" + nombreLibro + " #" + id);
        System.out.println("Precio: $" + precioLibro);
        System.out.println("Envio Gratuito: " + envioGratis2);
    }
}
