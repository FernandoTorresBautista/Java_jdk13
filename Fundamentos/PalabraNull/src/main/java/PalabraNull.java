// S16: Uso de la palabra null en java
//
public class PalabraNull {
    public static void main(String[] args) {
        // 
        Persona persona = new Persona("Fernando");
        System.out.println("N p1: " + persona.obtenerNombre());
        Persona persona2 = persona;
        System.out.println("N p2: " + persona2.obtenerNombre());
        // que no apunte a ningun objeto
        persona = null;
        // 
        if( persona != null){
            System.out.println("P1 : " + persona.obtenerNombre());
        }
        else{
            System.out.println("No apunta a ningun objeto");
        }
        
        persona2 = null;
        
        // System Garbage Collection
        System.gc();
    }
}

class Persona{
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
}