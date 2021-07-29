package test;

import domain.Persona;

/**
 * @author Fer
 */
public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Fernando")};
        for(Persona p:personas) {
            System.out.println("persona: " + p);
        }
    }
    
}
