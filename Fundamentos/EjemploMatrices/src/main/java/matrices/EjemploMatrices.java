// 25 Matrices en Java
package matrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        // Declaración de la matriz
        int edades [][];
        // Instanciamos la matriz
        edades = new int[3][2];
        // Instaciar valores de la matriz
        edades[0][0] = 30 ;
        edades[0][1] = 15 ; 
        edades[1][0] = 20 ; 
        edades[1][1] = 45 ; 
        edades[2][0] = 5 ; 
        edades[2][1] = 38 ;
        System.out.println("Ejemplo de tipos primitivos");
        // imprimimos la matriz
        for( int i=0; i<edades.length; i++ ){
            for( int j=0; j<edades[i].length; j++) {
                System.out.println("i: " + i + ", j: " + j + " -> " + edades[i][j]);
            }
        }
        
        // Objeto persona
        Persona personas [][];
        // inicializar la matriz
        personas = new Persona[1][2];
        // instanciamos valores
        personas[0][0] = new Persona("Fer");
        personas[0][1] = new Persona("Fernando");
        System.out.println("Ejemplo de objetos");
        // imprimimos la matriz
        for( int i=0; i<personas.length; i++ ){
            for( int j=0; j<personas[i].length; j++) {
                System.out.println("i: " + i + ", j: " + j + " -> " + personas[i][j]);
            }
        }
        
    }
}

