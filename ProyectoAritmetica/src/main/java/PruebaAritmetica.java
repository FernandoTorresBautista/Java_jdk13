// Seccion 9  : Metodos en java
// Seccion 10 : Contructores en java
public class PruebaAritmetica {
    public static void main(String[] args) {
        /*
        // Con el constructor vacio
        Aritmetica aritmetica = new Aritmetica();
        // int resultado = aritmetica.sumar(5, 10);
        // Inicializando los valores de la suma en el contructor vacio
        int resultado = aritmetica.sumar();
        System.out.println("Suma: " + resultado);
        System.out.println("Cambiando los valores de a y b desde el objeto 10 + 10:");
        aritmetica.a = 10;//No es buena practica es mejor hacerlo por metodos de clase
        aritmetica.b = 10;
        resultado = aritmetica.sumar();
        System.out.println("Suma: " + resultado);
        
        // Con el constructor con argumentos, crando el onjeto e inicializando las variables
        Aritmetica aritmetica2 = new Aritmetica(5, 10);
        System.out.println( "Resultado: " + aritmetica2.sumar() );
        */
        
        int operandoA = 6;
        int operandoB = 2;
        Aritmetica_S11 objeto1 = new Aritmetica_S11(operandoA,operandoB);
        
        System.out.println("Operando A: " + operandoA);
        System.out.println("Operando B: " + operandoB);
        
        //
        System.out.println("Suma: " + objeto1.sumar());
        System.out.println("Multiplicación: " + objeto1.multiplicar());
        System.out.println("Resta: " + objeto1.restar());
        System.out.println("Dividir: " + objeto1.dividir());
        
    }
}
