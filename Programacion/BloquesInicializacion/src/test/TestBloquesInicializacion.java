package test;

import domain.Persona;

/**
 * @author Fer
 */
public class TestBloquesInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("persona1: " + persona1);
        System.out.println("\n El bloque estatico solo se carga 1 vez en memoria");
        Persona persona2 = new Persona();
        System.out.println("persona2: " + persona2);
    }
    
}
