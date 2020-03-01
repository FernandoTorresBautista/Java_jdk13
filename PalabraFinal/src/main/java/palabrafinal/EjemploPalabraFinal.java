// 23 Uso de la palabra final
package palabrafinal;

public class EjemploPalabraFinal {
    public static void main(String[] args) {
        // Modificar un atributo marcado cómo final +solo quetando el final 
        // ClaseFinal.VAR_PRIMITIVO = 15; // ERROR
        
        // Modificar la referencia de un atributo tipo object
        // ClaseFinal.VAR_PERSONA = new Persona(); // ERROR
        
        ClaseFinal.VAR_PERSONA.setNombre("Fer");
        System.out.println("Nombre: " + ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Fernando");
        System.out.println("Nombre: " + ClaseFinal.VAR_PERSONA.getNombre());
    }
}
