package figura;

public class Caja {
    int ancho, alto, profundo;

    public Caja (){
        //ConstructorVacio
    }

    public Caja (int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public void calcularVolumen () {
        int volumen = this.ancho * this.alto * this.profundo;
        System.out.println("Volumen: " + volumen);
    }
}
