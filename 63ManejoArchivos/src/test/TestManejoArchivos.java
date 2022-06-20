package test;

import static manejoArchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        //escribirArchivo(nombreArchivo, "Hola desde JAVA ♥");
        //anexarArchivo(nombreArchivo, "Hello ♣");
        leerArchivo(nombreArchivo);
    }
}
