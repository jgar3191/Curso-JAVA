package test;
import excepciones.OperacionExcepcion;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {

        int resultado = 0;
        try { //si usamos RunTimeException no es necesario el bloque try catch
            //resultado = 10/0;
            division(10, 0);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Ocurrió un error de tipo Exception:  ");
            //e.printStackTrace(System.out); //Pila de excepciones
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("resultado = " + resultado);

    }
}
