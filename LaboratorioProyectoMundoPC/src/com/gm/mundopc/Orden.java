package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private static int contadorIdOrdenes;
    private Computadora computadoras[];
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorIdOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
                this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_COMPUTADORAS);
    }

    public void mostrarOrden(){
        System.out.println("Orden: " + this.idOrden + "\n");

        for(int i = 0; i< this.contadorComputadoras; i++){
            System.out.println(this.computadoras[i]);
        }
    }
}
