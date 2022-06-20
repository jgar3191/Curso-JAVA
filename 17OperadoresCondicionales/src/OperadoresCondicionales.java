public class OperadoresCondicionales {
    public static void main(String[] args) {
        var a = -1;
        var minValor = 0;
        var maxValor = 10;

        var resultado = a >= minValor && a <= maxValor;
        if(resultado)
            System.out.println("Dentro de rango");
        else System.out.println("Fuera de rango");


        var vacaciones = true;
        var diaDescanso = false;

        if(vacaciones || diaDescanso)
            System.out.println("El Padre puede asistir al juego de su hijo");
        else System.out.println("El Padre esta ocupado");
    }
}
