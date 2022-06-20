package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        //determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);
    }

    public static void determinarTipo (Empleado empleado){
        if (empleado instanceof Gerente){ //La variable está apuntando al tipo
            System.out.println("Es de tipo Gerente");
            //((Gerente) empleado).getDepartamento();
            Gerente gerenteHijo = (Gerente) empleado;
            System.out.println("gerenteHijo.getDepartamento() = " + gerenteHijo.getDepartamento());
        }
        else if (empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }
        else if (empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
