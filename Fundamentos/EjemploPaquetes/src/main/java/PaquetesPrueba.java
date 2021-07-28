//import com.ftb.Utileria; // 1
//import com.ftb.*; // 2 Cargar todas las clases del paquete
import static com.ftb.Utileria.imprimir; // 3

/**
 *
 * @author Fer
 */
public class PaquetesPrueba {
    public static void main(String[] args) {
        // Primer forma de llamar una clase de un paquete
        //com.ftb.Utileria.imprimir("Hola"); //1
        //
        //Utileria.imprimir("Hola");//2 Agrega el import
        //
        imprimir("Hola");// 3 Importando directamente el metodo estatico
    }
}
