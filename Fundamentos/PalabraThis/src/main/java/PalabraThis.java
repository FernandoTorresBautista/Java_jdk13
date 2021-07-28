// S15; Uso de la palabra this en javs
// 
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Fernando");        
    }
}

class Persona{
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre;
        System.out.println("Impresión del operador this en el constructor de la clase Persona: " + this);
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Objeto: " + persona);
        System.out.println("Impresión del obj acutal: " + this);
        
    }
}