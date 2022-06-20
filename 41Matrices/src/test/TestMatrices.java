package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        //Renglones//Columnas
        int edades[][] = new int[3][2];

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 3;
        edades[1][1] = 15;
        edades[2][0] = 26;
        edades[2][1] = 45;

        for (int ren = 0; ren < edades.length ; ren++){
            for (int col = 0; col < edades[ren].length; col++){
                System.out.println("Edades[" + ren + "][" + col +"]: " + edades[ren][col]);
            }
        }

        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa","Zarzamora", "Kiwi"}};

        imprimir(frutas);

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Jorge");
        personas[0][1] = new Persona("Cesar");
        personas[0][2] = new Persona("Ana");
        personas[1][0] = new Persona("Gerardo");
        personas[1][1] = new Persona("Emilio");
        personas[1][2] = new Persona("Flora");

        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]){
        for (int ren = 0; ren < matriz.length ; ren++){
            for (int col = 0; col < matriz[ren].length; col++){
                System.out.println("Matriz[" + ren + "][" + col +"]: " + matriz[ren][col]);
            }
        }
    }

    public static void escalerita(){
        for(int i = 3; i >= 0; i--){
            System.out.print("*");
            for(int j= 0; j < i ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
