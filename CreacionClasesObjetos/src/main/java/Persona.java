// Sección 7 Clases en java
// Sección 8 Objetos en java
// Sección 9 Metodos en java
public class Persona {
    // Atributos de la clase
    String nombre;
    String apellido;
    
    // Metodo de la clase
    // Usados por los objetos de ésta clase
    public void desplegarNombres(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido : " + apellido);
    }
    /*
    //Metodo
    tipo name(lista_de_argumentos){
        //cuerpo del metodo
    }
    */
    int sumar(int a, int b){
        return a+b;
    }
}
