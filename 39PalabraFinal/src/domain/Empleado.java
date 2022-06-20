package domain;

public class Empleado extends Persona {
    public final static int MI_CONSTANTE = 1;

    @Override
    public void imprimir(){
        System.out.println("Imprimir desde clase hija");
    }
}
