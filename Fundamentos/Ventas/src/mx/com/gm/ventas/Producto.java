package mx.com.gm.ventas;

/**
 * @author Fer
 */
public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nobre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
