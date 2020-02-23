// Sección 9 Metodos en java
// Seccion 10 : Contructores en java
public class Aritmetica_S11 {
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
    public Aritmetica_S11(){
        a = 5;
        b = 3;
        System.out.println("Ejecutando contructor vacio");
    }
    
    public Aritmetica_S11(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando contructor con 2 argumentos");
    }
    
    // public para poder acceder desde cualquier sitio
    // no se puede usar var cómo lista de parametros de metodo
    //public int sumar(int a, int b){
    public int sumar(){
        return this.a + this.b;
    }
    
    public int restar(){
        return this.a-this.b;
    }
    
    public int multiplicar(){
        return this.a*this.b;
    }
    
    public int dividir(){
        return (this.a/this.b);
    }
}
