package paquete1;

//No se pueden crear clases privadas

import java.sql.SQLOutput;

class Clase1 {
    private String atributoPrivado = "Valor atributo privado";

    private Clase1(){
        System.out.println("Constructor privado");
    }

    public Clase1(String arg){
        this(); //Podemos acceder al constructor privado usando uno publico y this pasando los argumentos
        //en caso de ser necesario
        System.out.println("Constructor publico");
    }

    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
