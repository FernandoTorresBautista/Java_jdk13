package domain;

/**
 * @author Fer
 */
public class Persona {
    // bloques de inicializacion estaticos y no estaticos, 
    // ambos se ejecutan antes del constructor
    private final int idPersona;
    private static int contadorPersonas;
    
    // bloque de inicializacion estatico, se ejecuta antes del constructor
    // y antes de cualquier bloque no estatico
    static{
        System.out.println("Ejecucion bloque estatico");
        // no se puede usar this en contexto estatico 
        // accediendo a traves del nombre de la clase(opcional)
        ++Persona.contadorPersonas;
    }
    
    // bloque de inicializacion no estatico, 
    // se ejecuta antes del constructor
    {
        System.out.println("Ejecucion cloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
    
}
