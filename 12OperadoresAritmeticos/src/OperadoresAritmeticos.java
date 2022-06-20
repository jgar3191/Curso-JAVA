public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multipliacion = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado division= " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo o residuo= " + resultado);

        if(b % 2 == 0)
            System.out.println("\nEs numero par");
         else
             System.out.println("\nEs numero impar");
    }
}
