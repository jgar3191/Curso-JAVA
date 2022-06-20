package paquete1;

public class Clase1 {
    //Una clase no puede ser Protected
    protected String atributoProtected = "Valor atributo Protected";

    public Clase1(String arg){
        System.out.println("Constructor Publico");
    }
    //Sólo se puede usar el constructor protected desde clases hijas
    protected Clase1(){
        System.out.println("Constructor Protected");
    }

    protected void metodoProtected(){
        System.out.println("Metodo Protected");
    }
}
