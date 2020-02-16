package mx.com.gm.holamundo;
import java.util.Scanner;

public class HolaMundo {

    /**
     * Curso udemy
     * Fundamentos de Java
     *  Sección 1: Instalación de requerimientos del curso
     *  Sección 2: Variables en java
     *  Sección 3: Tipos primitivos en java
     *  Sección 4: 
     */
    public static void main(String[] args) {
        HolaMundo secciones = new HolaMundo();
        secciones.seccion2();
        System.out.println("\n");
        secciones.seccion3();
    }
    
    /**
     * Sección 2:Variables en Java
     */
    public void seccion2() {
        // 0.0 
        /**
         * String a imprimir
         */
        String saludos = "Hola ";
        System.out.println(saludos);

        // 1.0 Uso de var
        /**
         * Después de la versión jdk 10 puede usarse
         */
        var despedirse = "Hasta luego";
        System.out.println(despedirse);
        var numero = 1;
        System.out.println(numero);

        // 2.0 --> 8
        /**
         * Concatenación ( + )
         */
        var str_1 = "Hola";
        var str_2 = "NAME";
        System.out.println(str_1 + " " + str_2);
        //La salida es Hola12, ya que primero encuentra una cadena lo restantes lo concatena
        System.out.println(str_1 + 1 + 2);
        //La salida es 3Hola, ya que primero encuentra un número hace la suma y después cocatena
        System.out.println(1 + 2 + str_1);

        // 3.0 --> 9
        /**
         * Reglas para definición de variables
         */
        // La primer letra en minuscula
        // Si son más de 1 palabra usar la notación de camello
        var strSaludosCamelloAnotation = "Hola desde java";
        System.out.println(strSaludosCamelloAnotation);
        // Identificadores
        // Se puede usar guion bajo, signo de pesos y minúsculas
        // no se pueden usar caracteres especiales y 
        // de igual forma no se puede iniciar con un número
        // Por último no usar paabras reservadas
        /* var _holaDesdeJava = 1;
        var $holaFromJava = 2;
        float hola;
        hola = 1; */

        // 4.0 --> 10
        /**
         * Caracteres especiales
         */
        String nombre = "Fernando";
        String apellido = "Torres";
        // Caracter de escape -> \
        System.out.println(nombre + " " + apellido);
        System.out.println(nombre + "\n" + apellido);// \n -> salto de linea 
        System.out.println(nombre + "\t" + apellido);// \t -> tabulador (tabulador)
        System.out.println(nombre + " " + "\b\b" + apellido);// \b -> retroceso (quita el espacio)
        System.out.println("\'" + nombre + "\'");// \' -> comilla simple 
        System.out.println("\"" + nombre + "\"");// \" -> comilla doble
        
        // 5.0 -> Scanner en Java
        /** 
         * import java.util.Scanner;
         * new Scanner
         *  System.in -> leer desde consola
         */
        //Leer desde consola
        Scanner lector = new Scanner(System.in);
        System.out.println("Proporciona el nombre del usuario y da Enter: \n");
        var usaurio_5 = lector.nextLine(); // Leer 1 línea completa 
        System.out.println("Usuario: " + usaurio_5);
        
        // Examen
        Scanner r = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        var res1 = r.nextLine();
        System.out.println("Proporciona el autor:");
        var res2 = r.nextLine();
        System.out.println(res1 + "fue escrito por" + res2);
    }
    
    /** 
     * Sección 3:Tipos primitivos en Java
     */
    public void seccion3() {
        // 0.0 
        /**
         * Tipos byte, short, int, long 
         */
        // byte
        byte byteVar = 15; //150 tipos incopatibles excede y se puede perder información
        System.out.println("byteVar: " + byteVar);
        System.out.println("bits en el tipo byte:" + Byte.SIZE);
        System.out.println("bytes en el tipo byte:" + Byte.BYTES);
        System.out.println("Valor mínimo del tipo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor máximo del tipo byte:" + Byte.MAX_VALUE);
        System.out.println("-----");
        // short 
        short shortVar = 100;
        System.out.println("shortVar: " + shortVar);
        System.out.println("bits en el tipo short:" + Short.SIZE);
        System.out.println("bytes en el tipo short:" + Short.BYTES);
        System.out.println("Valor mínimo del tipo short:" + Short.MIN_VALUE);
        System.out.println("Valor máximo del tipo short:" + Short.MAX_VALUE);
        System.out.println("-----");
        // int
        int intVar = 100;
        System.out.println("intVar: " + intVar);
        System.out.println("bits en el tipo int:" + Integer.SIZE);
        System.out.println("bytes en el tipo int:" + Integer.BYTES);
        System.out.println("Valor mínimo del tipo int:" + Integer.MIN_VALUE);
        System.out.println("Valor máximo del tipo int:" + Integer.MAX_VALUE);
        System.out.println("-----");
        // long -- Al final de la variable agregar una L mayúscula
        long longVar = 974653121354315L;
        System.out.println("longVar: " + longVar);
        System.out.println("bits en el tipo long:" + Long.SIZE);
        System.out.println("bytes en el tipo long:" + Long.BYTES);
        System.out.println("Valor mínimo del tipo long:" + Long.MIN_VALUE);
        System.out.println("Valor máximo del tipo long:" + Long.MAX_VALUE);
        // Manejo de tipos con variable var
        var varVar = 10; //
        System.out.println(varVar);// El tipo se define por la literal que se le asigna
        // 1.0 
        /**
         * Base decimal, hexadecimal y octal
         */
        
    }
}

