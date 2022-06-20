public class OperadoresDeIgualdad {
    public static void main(String[] args){
        var a = 3;
        var b = 7;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2; //Compara referencias del objeto no de las cadenas
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2); //Compara contenido
        System.out.println("f = " + f);
    }
}
