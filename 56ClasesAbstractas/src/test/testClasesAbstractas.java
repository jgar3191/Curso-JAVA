package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public abstract class testClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica(); //No se pueden crear objetos de tipo Abstracto

        FiguraGeometrica figura = new Rectangulo("Rectangulo"); //Upcatsing asignar a un padre un tipo hijo
        figura.dibujar();
    }
}
