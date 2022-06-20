package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    //Se ejecuta antes del constructor o cualquier clase dinámica
    //Se ejecuta sólo 1 vez
    static {
        System.out.println("Ejecución bloque estático");
        //No se puede usar el operador this por ser contexto estático
        ++Persona.contadorPersonas;
        //No se pueden inicializar variables no estáticas
    }

    //Bloque no estático
    {
        System.out.println("Ejecución BLOQUE NO ESTATICO");
        this.idPersona = Persona.contadorPersonas;
    }

    //Constructor de la clase
    public Persona(){
        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }
}
