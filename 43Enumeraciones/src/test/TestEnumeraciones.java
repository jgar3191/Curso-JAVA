package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //indicarDiaSemana(Dias.LUNES);
        //indicarDiaSemana(Dias.MARTES);
        System.out.println("Continente 4: " + Continentes.AMERICA);
        System.out.println("Paises en el 4to continente: " + Continentes.AMERICA.getPaises() + "\n");

        System.out.println("Continente 1: " + Continentes.AFRICA);
        System.out.println("Paises en el 1er continente: " + Continentes.AFRICA.getPaises());
    }

    public static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Dia 1: " + Dias.LUNES);
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Dia 2: " + Dias.MARTES);
                System.out.println("Segundo día de la semana");
            break;
            case MIERCOLES:
                System.out.println("Dia 3: " + Dias.MIERCOLES);
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Dia 4: " + Dias.JUEVES);
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Dia 5: " + Dias.VIERNES);
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Dia 6: " + Dias.SABADO);
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Dia 7: " + Dias.DOMINGO);
                System.out.println("Séptimo día de la semana");
                break;
        }
    }
}
