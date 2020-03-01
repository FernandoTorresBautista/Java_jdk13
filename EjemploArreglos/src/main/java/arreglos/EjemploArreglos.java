// 24 Arreglos en java
package arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        // 1. arreglo de variabales int
        int [] edades;
        // 2. Instacia del arreglo int
        edades = new int[3];
        edades[0] = 10;
        edades[1] = 15;
        edades[2] = 20;
        //
        System.out.println("edades 1: " + edades[0]);
        System.out.println("edades 2: " + edades[1]);
        System.out.println("edades 3: " + edades[2]);
        
        //1. Declarar e instanciar un arreglo tipo object
        Persona personas[] = new Persona[4];
        //2. Inicializamos valores del arreglo
        personas[0] = new Persona("Fer");
        personas[2] = new Persona("Fernando");
        
        System.out.println("Persona indice 0: " + personas[0]);
        System.out.println("Persona indice 1: " + personas[1]);
        System.out.println("Persona indice 2: " + personas[2]);
        System.out.println("Persona indice 3: " + personas[3]);
        //
        
        // 95. ejercicio. parte 2
        String nombres[] = {"Fernando", "Fer", "F", "FTB"};
        for(int i=0; i<nombres.length; i++){
            System.out.println("Arreglo String indice " + i + ": " + nombres[i]);
        }
    }
}
