package test;

import domain.Cliente;
import domain.Empleado;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("César Barba", 35800.75);
        System.out.println("Empleado1 = c " + empleado1);

        Cliente cliente1;
        cliente1 = new Cliente(new Date(), true, "Juan", 'H', 35, "Av. Mexico #123");
        System.out.println("\nCliente1 = " + cliente1);

        Date fechaReg = new Date();
        Cliente cliente2;
        cliente2 = new Cliente(fechaReg, false, "Ana", 'M', 24, "Fake Street #999");
        System.out.println("\nCliente2 = " + cliente2);
    }
}
