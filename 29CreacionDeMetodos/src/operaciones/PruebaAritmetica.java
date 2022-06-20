package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 5;
        aritmetica1.b = 7;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde clase de prueba = " + resultado);
        resultado = aritmetica1.sumarConArgumentos(8 , 2);
        System.out.println("resultado suma con argumentos= " + resultado);

    }
}
