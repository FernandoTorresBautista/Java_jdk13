// Sección 7 Clases en java
// Sección 8 Objetos en java
// Sección 9 Metodos en java
public class PruebaPersonas {
    public static void main(String[] args) {
        // Definición de la variable persona 
        Persona persona1;
        
        // Instanciar(crear) un objeto de la clase Persona
        persona1 = new Persona();
        
        // Acciones del objeto
        persona1.desplegarNombres();
        persona1.nombre = "Fernando";
        persona1.apellido = "Torres";
        System.out.println("");
        persona1.desplegarNombres();
        
        // Creando un nuevo objeto
        Persona persona2 = new Persona();
        persona2.nombre = "Fernando2";
        persona2.apellido = "Torres2";
        persona2.desplegarNombres();
        
        // Creando un nuevo objeto para usar un metodo y sus argumentos
        Persona persona3 = new Persona();
        int resultado = persona3.sumar(5, 10);
        System.out.println("Resultado: " + resultado);
    }
}
