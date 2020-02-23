// S17: Encapsulamiento en java
// 
public class Persona {
    /*
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    */
    
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.eliminado = eliminado;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Para los tipos boolean se genera el is en lugar de get
    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /*
    public String toString(){
        return "Nombre: " + this.nombre + ", \nSueldo: " + this.sueldo + ", \nEliminado: " + this.eliminado;  
    }
    */
    
    // Clck derecho + Insert code + toStrong()
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }
    
}
