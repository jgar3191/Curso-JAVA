import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("Introduce 2 valores");
        System.out.println("Valor 1:");
        valor1 = Integer.parseInt(scan.nextLine());
        System.out.println("Valor 2");
        valor2 = Integer.parseInt(scan.nextLine());

        var resultado = valor1 > valor2 ? "Es mayor el valor 1" : "Es mayor el valor 2";
        System.out.println("resultado = " + resultado);
    }
}
