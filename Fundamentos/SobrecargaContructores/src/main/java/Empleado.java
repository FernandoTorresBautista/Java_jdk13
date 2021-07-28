// 20 : Sobrecarga de constructores
public class Empleado extends Persona{
    private double sueldo;
    
    //Se crea por cómo esta creada la clase Persona
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }
    
    //
    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        //this(nombre, edad);//funcionan ambas sólo se usa una cómo la primera linea
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
}
