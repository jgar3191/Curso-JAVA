import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alto, ancho, perimetro, area;

        System.out.println("Proporciona el alto del rectangulo");
        alto = Integer.parseInt(scan.nextLine());
        System.out.println("Proporciona el ancho");
        ancho = Integer.parseInt(scan.nextLine());

        perimetro = (ancho * alto) * 2;
        area = ancho * alto;

        System.out.println("Perimetro = " + perimetro);
        System.out.println("Area = " + area);


    }
}
