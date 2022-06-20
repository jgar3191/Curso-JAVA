package mundoPC;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluehooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");

        Computadora computadoraHP = new Computadora("ComputadoraHP", monitorHP, tecladoHP, ratonHP);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.mostrarOrden();
    }
}
