package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List <String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        String elemento = miLista.get(0);
        //System.out.println("elemento = " + elemento);
       //imprimir(miLista);

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

        //imprimir(miSet);

        Map<String,String> miMapa = new HashMap<>();
        miMapa.put("valor1" ,"Jorge");
        miMapa.put("valor2", "César");
        miMapa.put("valor3", "Dana");
        miMapa.put("valor3", "Emilio");

        //String elemento = (String) miMapa.get("valor1");
        //System.out.println("Elemento: " + elemento);

        //miMapa.keySet(); //Devuelve sólo las llaves
        imprimir((miMapa.keySet()));
        imprimir(miMapa.values());// devuelve sólo los valores

    }
    //Si lo hago Object es más genérico pero si lo hago String sólo strings serán
    public static void imprimir(Collection<String> coleccion){
        for (String elemento: coleccion) {
            System.out.println("elemento = " + elemento);
        }

        //Funciones Labda o Flecha en vez del for Each
        //La lista usa el método foreach
        coleccion.forEach(elemento-> {
            System.out.println("Elemento: " + elemento.toUpperCase());
        });
    }
}
