public class OperadorTernario {
    public static void main(String[] args) {
        var resultado = (3 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        var numero = 9;
        resultado = (numero % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println("resultado = " + resultado);
    }
}
