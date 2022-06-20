package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {

    public ClaseHija(){
        super();
        this.atributoProtected = "Modificación atributo protected";
        System.out.println("Atributo Protegido = " + this.atributoProtected);
        this.metodoProtected();
    }


}
