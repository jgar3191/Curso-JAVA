public class Concatenacion {
    public static void main(String args[]){
        var usuario = "Jorge";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); //Suma de numeros
        System.out.println(i + j + usuario); //Suma primero y luego concatena (Izq a der)
        System.out.println(usuario + i + j); //Toma como cadena los ints (Contexto cadena, si encuentra primero una cádena todo lo demás s cadena)
        System.out.println(usuario + (i + j)); //Parentesis modifican el valor de prioridad

    }
}
