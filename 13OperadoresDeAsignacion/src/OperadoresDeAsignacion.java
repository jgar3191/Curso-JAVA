public class OperadoresDeAsignacion {
    public static void main(String[] args){
        //Operador de asignación
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);

        //Operador de asignación pero de composión
        a += 1; //a = a + 1
        System.out.println("a = " + a);
        a += 3; //a = a + 3
        System.out.println("a = " + a);
        a -= 2; //a = a - 2
        System.out.println("a = " + a);
        a *= 7; //a = a * 7
        System.out.println("a = " + a);
        a /= 3; //a = a / 3
        System.out.println("a = " + a);
        a %= 2; //a = a % 2
        System.out.println("a = " + a);

    }
}
