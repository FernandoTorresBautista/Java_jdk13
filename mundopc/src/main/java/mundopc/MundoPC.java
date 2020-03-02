package mundopc;

import com.ftb.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        //Crar un objeto computadora para ello:
        Raton raton1 = new Raton("USB", "marca_uno");
        Raton raton2 = new Raton("USB", "marca_dos");
        //
        Teclado teclado1 = new Teclado("USB", "marca_uno");
        Teclado teclado2 = new Teclado("USB", "marca_dos");
        //
        Monitor monitor1 = new Monitor("marca_uno", 24.00);
        Monitor monitor2 = new Monitor("marca_dos", 32.00);
        //
        Computadora computadora1 = new Computadora("Computadora 1", monitor1, teclado1, raton1);
        computadora1.setPrecio(10000);
        Computadora computadora2 = new Computadora("Computadora 2", monitor2, teclado2, raton2);
        computadora2.setPrecio(30000);
        //
        //System.out.println("Computadora 1: " + computadora1);
        //System.out.println("Computadora 1: " + computadora2);
        // creamos ordenes y le agregamos computadoras;
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        // Imprimir con la función mostrar orden
        orden1.mostrarOrden();
        System.out.println("Total de la orden1 : " + (orden1.calcularTotal()));
        // ejemplo 2
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora2);
        orden2.agregarComputadora(computadora1);
        orden2.agregarComputadora(computadora2);
        orden2.agregarComputadora(computadora1);
        // Imprimir con la función mostrar orden
        orden2.mostrarOrden();
        System.out.println("Total de la orden1 : " + (orden2.calcularTotal()));
    }
}
