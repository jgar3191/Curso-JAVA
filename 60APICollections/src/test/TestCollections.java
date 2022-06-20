package test;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        imprimir(miLista);

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

        imprimir(miSet);

        Map miMapa = new HashMap();
        miMapa.put("valor1" ,"Juan");
        miMapa.put("valor2", "Genaro");
        miMapa.put("valor3", "Dana");

        String elemento = (String) miMapa.get("valor1");
        System.out.println("Elemento: " + elemento);

        //miMapa.keySet(); //Devuelve sólo las llaves
        imprimir((miMapa.keySet()));
        imprimir(miMapa.values());// devuelve sólo los valores

    }
    public static void imprimir(Collection coleccion){
        /*for (Object elemento: coleccion) {
            System.out.println("elemento = " + elemento);
        }*/

        //Funciones Labda o Flecha en vez del for Each
        //La lista usa el método foreach
        coleccion.forEach(elemento-> {
            System.out.println("Elemento: " + elemento);
        });
    }
}
