package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 * @author Fer
 */
public class TestEnumeraciones {
    public static void main(String[] args) {
        // de entrada son cadenas constantes
        //System.out.println("dias 1 de la semana: " + Dias.LUNES);
        //indicarDiaSemana(Dias.MIERCOLES);
        
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("No. de paises en el 4 continente: " 
                + Continentes.AMERICA.getPaises());
        
        System.out.println("Continente no. 1: " + Continentes.AFRICA);
        System.out.println("No. de paises en el 1 continente: " 
                + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias) {
        switch(dias){ // en el switch ya sabe que es enumeracion
            case LUNES: // por tanto en el case se pone el valor 
                System.out.println("primer dia de la semana");
                break;
            case MARTES:
                System.out.println("segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("tercer dia de la semana");
                break;
        }
    }
    
}
