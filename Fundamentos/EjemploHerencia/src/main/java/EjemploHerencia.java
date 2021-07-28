
import java.util.Date;

// 19 Herencia en java
public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("Herencia en Java\n");
        // Empleado
        Empleado empleado1 = new Empleado("Fernando", 5000);
        //
        empleado1.setEdad(20);
        empleado1.setGenero('M');
        empleado1.setDireccion("Direccion ejemplo");
        //
        System.out.println(empleado1);
        
        // Cliente
        Cliente cliente1 = new Cliente(new Date(), true);
        //
        cliente1.setEdad(40);
        cliente1.setGenero('M');
        cliente1.setDireccion("Direccion ejemplo");
        cliente1.setNombre("Fer");
        //
        System.out.println(cliente1);
    }
}
