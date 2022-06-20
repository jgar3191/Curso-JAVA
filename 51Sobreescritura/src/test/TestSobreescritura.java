package test;

import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Cesar", 65000.00, "Relaciones Publicas");
        System.out.println("gerente1.obtenerDetalles() = " + gerente1.obtenerDetalles());
    }
}
