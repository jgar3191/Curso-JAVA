public class OperadoresUnarios {
    public static void main(String[] args){
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("\nc = " + c);
        System.out.println("d = " + d);

        //Operadores Unarios Incremento
        // 1. Preincremento (Simbolo antes de la variable)
        var e = 9;
        var f = ++e;
        System.out.println("\ne = " + e); //llega valiendo 4 por la asignacion de f = ++e
        System.out.println("f = " + f);

        //2.Postincremento (Símbolo después de la asignación)
        var g = 5;
        var h = g++; //Primero se usa el valor y luego después se incrementa
        System.out.println("\ng = " + g); //Teniamos pendinte un incremento
        System.out.println("h = " + h);

        //Operadores Unarios Decremento
        //1.Predecremento
        var i = 2;
        var j = --i;

        System.out.println("\ni = " + i); //Ya está decrenentada
        System.out.println("j = " + j);

        //2.Postdecremento
        var k = 4;
        var l = k--; //Primero se usa el valor de la variable y queda pendiente un decremento
        System.out.println("\nk = " + k); //tiene pendiente un decremento
        System.out.println("l = " + l);
    }
}
