// 13: Paso por Valor y Paso por Referencia en java
public class Persona {
    String nombre;
    
    public String obtenerNombre(){
        return this.nombre;
    }
    
    public void cambiarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
}
