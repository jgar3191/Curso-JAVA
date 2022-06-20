package paquete1;

//En Default o Package todo debe estar en el mismo paquete

class ClaseHija extends Clase1 {
    public ClaseHija(){
        super();
        this.atributoDefault = "Modificacion atributo default";
        System.out.println("Atributo Default = " + this.atributoDefault);
        this.metodoDefault();
    }
}
