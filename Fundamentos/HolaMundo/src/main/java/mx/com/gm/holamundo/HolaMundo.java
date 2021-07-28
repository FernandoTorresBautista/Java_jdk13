package mx.com.gm.holamundo;
import java.util.Scanner;

public class HolaMundo {

    /**
     * Curso udemy
     * Fundamentos de Java
     *  Sección 1: Instalación de requerimientos del curso
     *  Sección 2: Variables en java
     *  Sección 3: Tipos primitivos en java
     *  Sección 4: Operadores en java
     *  Sección 5: Sentencias de control
     *  Sección 6: Ciclos en java
     */
    public static void main(String[] args) {
        HolaMundo secciones = new HolaMundo();
        /*secciones.seccion2();
        System.out.println("\n");
        secciones.seccion3();
        System.out.println("\n");
        secciones.seccion4();
        System.out.println("\n");
        secciones.seccion5();*/
        System.out.println("\n");
        secciones.seccion6();
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
    
    /**
     * Sección 4: Operadores en java
     */
    public void seccion4(){
        // 0.0 
        /**
         * Operadoresa atirmeticos en java
         */
        System.out.println("Operadoresa atirmeticos en java");
        int a=1, b=2;
        int resultado = a + b;
        System.out.println("r: " + resultado);
        System.out.println("r: " + (a + b));//sin el () nos concatenaría
        //resta -
        //multiplicación *
        //división /
        //modulo %        
        
        //tarea
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(scanner.nextLine());
        System.out.println("Area: " + (alto*ancho) );
        System.out.println("Perimetro: " + ((alto+ancho)*2));
        
        // 1.0 
        /**
         * Operadores en Asignación en java
         */
        a =3;
        b=2;
        int r = a+5-b;
        System.out.println(r);
        a += 1;//suma
        a -= 1;//resta
        // *=, /=, %=
        // 2.0 
        /**
         * Operadores Unarios en java
         */
        a = 3;
        b = -a;
        boolean c = true;
        boolean d = !c;
        int e = 3;
        int f = ++e;
        System.out.println(e + ", " + f);//4, 4
        int g = 5;
        int h = g++;
        System.out.println(g + ", " + h);//6, 5
        e = 3;
        f = --e;
        System.out.println(e + ", " + f);//2, 2
        g = 5;
        h = g--;
        System.out.println(g + ", " + h);//4, 5
        
        // 2.0 
        /**
         * Operadores de Igualdad y Relacionales en java
         */
        a = 2;
        b = 3;
        c = a==b;   //igualdad
        System.out.println(c);
        c = a!=b;           //es diferente de
        System.out.println(c);
        String str1 = "hola";
        String str2 = "adios";
        System.out.println(str1.equals(str2)); // en strings con equals
        c = a < b;
        System.out.println(c); //true
        c = a > b;
        System.out.println(c); //false
        // >=, <=, 
        if( b%2 == 0){
            System.out.println("numero par");
        }
        else{
            System.out.println("numero impar");
        }
        
        // 3.0 
        /**
         * Operadores condicionales
         */
        a = 10;  //int 
        int valorMinimo = 0, valorMaximo = 10;
        boolean respuesta = a >= valorMinimo && a <= valorMaximo;  // ||->or, &&->and
        System.out.println(respuesta);
        
        // 4.0 
        /**
         * Operador ternario
         */
        respuesta = (3 > 2)?true:false;
        System.out.println(respuesta);
        // var para soportar cualquier valor que regrese 
        var res_return_all = (valorMinimo < valorMaximo)?"true":"false";//regresa un string 
        System.out.println(res_return_all);
        
        //tarea 
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:\n" + ((numero1 > numero2)?numero1:numero2) );
        
        // 5.0 
        /**
         * Precedencia de operadores
         */
        var x = 5;
        var y = 10;
        var z = ++x + y--; // x=5 y=10
        System.out.println(z);// 16
        //z = ++x + y--; // x=5 y=10
        //System.out.println(z);// 16
        // 1. ()
        // 2. % * /
        // + - 
        
        /**
         * Tarea
         */
        System.out.println("Tarea");
        tarea4();
    }
    
    public void tarea4(){
        int a = 2;
        int b = 3;
        int res = -3 + 6 / ++a * 4 - b-- + b;
        System.out.println(6 / 3); //Imprime 2
        System.out.println(2 * 4 ); //imprime 8
        System.out.println(-3 + 8); //imprime 5
        System.out.println(5 - 3); //imprime 2
        System.out.println(2 + 2);//imprime 4,
        System.out.println("res: " + res);
    }
    
    /**
     * 5.0 Sentencias de control
     */
    public void seccion5(){
        // 1.0      
        var condicion = true;   // Se pueden usar as agrupaciones de condicionales 
        // numero = 1, 
        if(condicion){ // numero == 3, 
            System.out.println("true");
        }
        /*else if( numero == 2 ){ 
            System.out.println("numero == 2");
        }*/
        else{
            System.out.println("Ninguna");
        }
        
        //switch
        // Antes del jdk 7 sólo soportaba las expresiones de los tipos:
        // byte short int char 
        // > jdk 7  ->  String
        var expresion = 3;
        switch(expresion){
            case 1:
                System.out.println("op 1");
                break;
            case 2:
                System.out.println("op 2");
                break;
            default:
                System.out.println("no one");
                break;
        }
        // Operadores 
        //  && || ^   !, and or xor->(ambas entradas iguales) not
        // Oper. Relacionales -> 
        //  > >= < <= == !=
        
        /**
         * Tarea 5
        */
        tarea5();
        
        // if
        var mes = 0;
        String estacion = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un mes del año: ");
        mes = scanner.nextInt(); 
        
        if( mes==1 || mes==2 || mes ==12 ){
            estacion = "invierno";
        }
        else if( mes==3 || mes==4 || mes ==5  ){
            estacion = "primavera";
        }
        else if( mes==6 || mes==7 || mes ==8  ){
            estacion = "verano";
        }
        else if( mes==9 || mes==10 || mes ==11  ){
            estacion = "otoño";
        }
        else{
            estacion = "Mes incorrecto";
        }
        System.out.println("estacion: " + estacion);
        //
        //switch
        var numero = 0;
        var numeroTexto = "Numero";
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            default:
                numeroTexto = "Numero desconocido";
                break; //Puede o no agregarse
        }
        System.out.println(numeroTexto);
        //
        //
        mes = scanner.nextInt();
        switch(mes){
            case 1:case 2:case 12:
                System.out.println("Invierno");
                break;
            case 3:case 4:case 5:
                System.out.println("Primavera");
                break;
            case 6:case 7:case 8:
                System.out.println("Verano");
                break;
            case 9:case 10:case 11:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Mes deconocido");
                break;
        }
    }
    
    // Tarea 5 sección 5
    public void tarea5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        int calificacion = Integer.parseInt(scanner.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (calificacion >= 9 && calificacion <= 10)
            System.out.println("A");
        //Si esta entre  8 y menor a 9 imprimir: B
        else if(calificacion >= 8 && calificacion < 9)
            System.out.println("B");
        //Si esta entre 7 y menor a 8 imprimir: C
        else if(calificacion >= 7 && calificacion < 8)
            System.out.println("C");
        //Si esta entre 6 y menor a 7 imprimir: D
        else if(calificacion >= 6 && calificacion < 7)
            System.out.println("D");
        //Si esta entre 0 y menor a 6 imprimir: F
        else if(calificacion >= 0 && calificacion < 6)
            System.out.println("F");
        //Si no esta en el rago, imprimir: Valor desconocido
        else
            System.out.println("Valor desconocido");
    }

    /**
     * 6.0 Ciclos en Java
     */
    public void seccion6(){
        // 1.0 Ciclo while()
        //while( valorBooleano ){...}
        // 2.0 Ciclo do...while();
        //do{...}while(valorBooleano);
        // 3.0 Ciclo for
        //for( inicializacion; condicion; iteracion  ){}//condicion booleana
        // 4.0 Ciclo while, do...while
        // La condición se puede dar por expreiones con valor booleano
        var bool = true;
        while(bool){
            System.out.println("Valor de bool:" + bool);
            if(bool){
                bool = false;
            }
        }
        do{
            System.out.println("Valor de bool:" + bool);
            if(bool){
                bool = false;
            }
        }while(bool);
        // 5.0 For
        for( var a=0; a<2; a++ ){
            System.out.println("Valor de a: " + a);
        }
        // 6.0 Palabras: Break y continue;
        // break puede romper la ejecución de ciclos while, do while, for
        for( var a=0;a<4;a++ ){
            System.out.println("Valor de a (con break): " + a);
            break;
        }//Solo se imprimira una vez
        for( var a=0;a<4;a++ ){
            if( a==0 ){
                continue;
            }
            System.out.println("Valor de a (con continue): " + a);
        }//No se imprimira nada ya que desde 0 se sale del ciclo
        
        // 7.0 
        // Uso de etiquetas, casi no se usa, se parecen al go to de c y sólo es para
        // saber que existen en caso de certifición
        // ->  donde se rompe y hacía donde ir en ese caso
        // continue inicio:
        // break inicio:
        
        inicio:
        for( var i=0; i<3; i++){
            //imprimimos solo numero pares
            if( i % 2 != 0 ){
                break inicio;
                //continue inicio; 
            }
            System.out.println("i = " + i);
        }
        
        
    }
    
    //    
}

