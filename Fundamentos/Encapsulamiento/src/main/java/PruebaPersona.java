// S17: Encapsulamiento en java
// 
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Fernando", 10000, false);
        //System.out.println("Nombre Persona : " + persona.nombre );//No es recomendable
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Sueldo: " + persona.getSueldo());
        System.out.println("Eliminado: " + persona.isEliminado());
        
        persona.setNombre("Fer");
        persona.setSueldo(5000);
        persona.setEliminado(true);
        /*
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Sueldo: " + persona.getSueldo());
        System.out.println("Eliminado: " + persona.isEliminado());
        */
        // imprimir una vez en consola
        System.out.println("Persona: " + persona.toString());
        //Se llama el método toString() de manera implicita por el método println();
        System.out.println("Persona: " + persona);
    }
}
