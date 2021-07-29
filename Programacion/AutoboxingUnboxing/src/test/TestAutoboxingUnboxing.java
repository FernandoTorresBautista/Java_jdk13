package test;

/**
 * @author Fer
 */
public class TestAutoboxingUnboxing {
    // clase wropper o envolvente de tipos primitivos
    public static void main(String[] args) {
        /* primitivo - envolvente
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte 
        Char - Character
        short - Short*/
        int entero = 10;
        Integer entero2 = 10; // Autoboxing object
        System.out.println("entero primitivo= " + entero);
        System.out.println("entero objeto = " + entero2);
        System.out.println("entero objeto string = " + entero2.toString());
        // tiene mas metodos para convertir el entero2
        System.out.println("entero objeto = " + entero2.doubleValue()); // Autoboxing entero en object
        
        int entero3 = entero; // Unboxing de objecto al primitivo int
        System.out.println("entero3 = " + entero3);
    }
}
