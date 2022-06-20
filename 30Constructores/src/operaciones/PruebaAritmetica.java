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
        
        Aritmetica aritmetica2 = new Aritmetica(4,3);
        System.out.println("aritmetica2.a = " + aritmetica2.a);
        System.out.println("aritmetica2.b = " + aritmetica2.b);
        resultado = aritmetica2.sumarConRetorno();
        System.out.println("resultado desde clase de prueba = " + resultado);


    }
}
