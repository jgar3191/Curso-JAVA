public class OperadoresRelacionales {
    public static void main(String[] args) {
        var a = 3;
        var b = 7;

        var g = a >= b; //Mayor que o el mayor o igual >=
        System.out.println("g = " + g);

        if (a % 2 == 0)
            System.out.println("Es numero par");
        else System.out.println("Es numero impar");

        var edad = 16;
        var adulto = 18;

        if(edad >= adulto)
            System.out.println("Es un adulto");
        else System.out.println("Es menor de edad");

    }
}