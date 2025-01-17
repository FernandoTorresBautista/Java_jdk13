// 19 Herencia en java

public class Empleado extends Persona{
    private int idEmpleado; 
    private double sueldo;
    private static int contadorEmpleados; //contador de objetos empleado

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
/*
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
*/
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }
/*
    public static void setContadorEmpleados(int contadorEmpleados) {
        Empleado.contadorEmpleados = contadorEmpleados;
    }
*/

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}
