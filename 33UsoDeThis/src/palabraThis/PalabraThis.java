package palabraThis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Lopez");
        System.out.println("persona.nombre = " + persona.nombre);
        System.out.println("persona.apellido = " + persona.apellido);
    }
}

class Persona {
    String nombre;
    String apellido;

    Persona (String nombre, String apellido){
        //super(); Llamada al constructor de la clase padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando la palabra this: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
    }
}
