package test;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

public class TestVentas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Jeans", 150.50);
        Producto producto2 = new Producto("Camisa", 50.75);
        Producto producto3 = new Producto("Sudadera", 250.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
    }
}
