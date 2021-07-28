// Sección 9 Metodos en java
// Seccion 10 : Contructores en java
public class Aritmetica {
    // Atributos de clase
    int a;
    int b;
    /**
     * Contructores, 
     * Si no se agrega un constructor, java define el vacio por default
     * cuando agregamos uno, debemos definir el vacio
     * los constructores inicializan atributos de la clase
     */
    // Constructor vacio    
    public Aritmetica(){
        a = 5;
        b = 3;
        System.out.println("Ejecutando contructor vacio");
    }
    
    public Aritmetica(int arg1, int arg2){
        a = arg1;
        b = arg2;
        System.out.println("Ejecutando contructor con 2 argumentos");
    }
    
    // public para poder acceder desde cualquier sitio
    // no se puede usar var cómo lista de parametros de metodo
    //public int sumar(int a, int b){
    public int sumar(){
        return a + b;
    }
}
