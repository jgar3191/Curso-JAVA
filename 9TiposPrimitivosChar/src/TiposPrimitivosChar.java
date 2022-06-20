public class TiposPrimitivosChar {
    public static void main(String[] args) {
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021'; //Usando Unicode //!
        System.out.println("varChar = " + varChar);
        
        char varCharDec = 33; //!
        System.out.println("varCharDec = " + varCharDec);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        var varChar1 = '\u0021';
        System.out.println("\nvarChar1 = " + varChar1);

        var varChar2 = 33; //Este no se puede porque lo toma como Entero
        System.out.println("varChar2 = " + varChar2);

        var varChar3 = '!';
        System.out.println("varChar3 = " + varChar3);

        int variableEnteraSimbolo = '!'; //33 en unicode es !
        System.out.println("\nvariableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'a';//97 en unicode es a
        System.out.println("letra = " + letra);
    }
}
