package test;

/**
 * @author Fer
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4,5);
        variosParametros("varios parametros, al final los parametros variables", 1,2,3,4);
    }
    
    public static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
    }
}
