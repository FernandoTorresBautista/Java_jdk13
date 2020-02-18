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
        int numeroDecimal = 10;
        System.out.println(numeroDecimal);
        int numeroOctal = 012;
        System.out.println(numeroOctal);
        int numeroHexadecimal = 0xA;
        System.out.println(numeroHexadecimal);
        int numeroBinario = 0b1010; // 0b -> binario
        System.out.println(numeroBinario);
        // var
        var numeroCualquier = 10; // 012, 0xA, 0b1010
        System.out.println(numeroCualquier); // Toma el valor de lo asignado
        // 2.0 Flotantes
        /**
         * float, double
         */
        float floatVar = 1000.00F; //tipo double por default a tipo float x...x(F)
        var floatVar_2 = 1000.00F; // Var de igual forma se define con el literal
        System.out.println(floatVar);
        System.out.println(floatVar_2);
        
        System.out.println("bits en el tipo float:" + Float.SIZE);
        System.out.println("bytes en el tipo float:" + Float.BYTES);
        System.out.println("Valor mínimo del tipo float:" + Float.MIN_VALUE);
        System.out.println("Valor máximo del tipo float:" + Float.MAX_VALUE);
        
        double doubleVar = 1000D; // Con D
        var doubleVar_2 = 1000D; // Var sin la D sería un entero
        System.out.println(doubleVar);
        System.out.println(doubleVar_2);
        
        System.out.println("bits en el tipo double:" + Double.SIZE);
        System.out.println("bytes en el tipo double:" + Double.BYTES);
        System.out.println("Valor mínimo del tipo double:" + Double.MIN_VALUE);
        System.out.println("Valor máximo del tipo double:" + Double.MAX_VALUE);
        // 3.0 
        /** 
         * Tipo char
         */
        System.out.println("bits en el tipo char:" + Character.SIZE);
        System.out.println("bytes en el tipo char:" + Character.BYTES);
        System.out.println("Valor mínimo del tipo char:" + Character.MIN_VALUE);
        System.out.println("Valor máximo del tipo char:" + Character.MAX_VALUE);
        char varChar = 'a';
        System.out.println(varChar);    //3 formas de manejarlos, por var es lo mismo excepto:
        char porUnicode = '\u0021';     // por códugo unicode,
        char porNumeroDecimal = 33;     // por su número decimal equivalente, en caso de usar var no es recomendable
        char porSimbolo = '!';          // por el simbolo directamnete,
        System.out.println(porUnicode);
        System.out.println(porNumeroDecimal );
        System.out.println(porSimbolo);
        // 4.0 
        /**
         * Boolean
         */
        //No tiene definido cuántos bites ocupa 32 o 64 dependiendo de la platarforma o so
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        var varBoolean = 2 > 1;
        System.out.println(varBoolean);
        // 5.0
        /**
         * Conversión de tipos primitivos   
         */
        //convertir un String a un tipo int
        var edad = Integer.parseInt("20");// o int edad = ...
        System.out.println(edad);
        // entero a double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println(valorPI);
        // cadena a char, 1 valor
        char parseStoCa = "HoLa".charAt(0);// se inicia en 0, 1, ...
        System.out.println(parseStoCa);
        //  leer un número de consola
        var scanner = new Scanner(System.in);
        int edad_5 = Integer.parseInt(scanner.nextLine()); // leer un número desde consola
        System.out.println( edad_5 );
        char caracter_5 = scanner.nextLine().charAt(0); // puedes concatenar el método para que te obtenga un caracter x
        System.out.println(caracter_5);
        
        String edadEnTexto = String.valueOf(10);//De cualquier tipo de datos primivitos
        System.out.println(edadEnTexto);
        edadEnTexto = String.valueOf(false);//De cualquier tipo de datos primivitos
        System.out.println(edadEnTexto);
        
        edadEnTexto = String.valueOf(false);//De cualquier tipo de datos primivitos
        System.out.println(edadEnTexto);
        
        char a_entretipos = 10;
        byte b_entretipos = (byte)a_entretipos ;//sin el cart hubiera error, un char no cabe en un byte
        System.out.println( b_entretipos ); // 
        //byte b_entretipos = (short)a_entretipos ;//por el tamaño no soportado tendrá una perdida de bites, así es
        
        /**
         * Tarea
         */
        System.out.println("Tarea");
        tarea3();
    }
    
    /**
     * Para imprimir poner la clase :
     * public class Main{
     *  public static void main(String[] agrs){
     *   ... (código de la función tarea3)
     *  }
     * }
     */
    public void tarea3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el simbolo:");
        char simbolo = scanner.nextLine().charAt(0);
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(nombre + " #" + id );//<nombre> #<id>
        System.out.println("Precio: " + simbolo + precio);//Precio: <simbolo><precio>
        System.out.println("Envio Gratuito: " + envioGratuito);//Envio Gratuito: <envioGratuito>
    }
}

