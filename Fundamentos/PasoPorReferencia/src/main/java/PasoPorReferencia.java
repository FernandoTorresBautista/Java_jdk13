// 13: Paso por Valor y Paso por Referencia en java
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.cambiarNombre("Fernando");
        
        System.out.println("Valor Nombre: " + persona.obtenerNombre());
        
        modificarPersona(persona);
        
        System.out.println("Valor Nombre Modificado: " + persona.obtenerNombre());
    }

    private static void modificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Fer");
    }
}
