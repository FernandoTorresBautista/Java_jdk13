package com.ftb.mundopc;

public class Orden {
    private int idOrden;
    private Computadora[] computadoras;
    private int contadorComputadoras;
    private static int contadorOrdenes;
    private static int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++this.contadorOrdenes;
        this.computadoras = new Computadora[this.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if( this.contadorComputadoras < this.MAX_COMPUTADORAS ){
            //int aux = contadorComputadoras;
            //contadorComputadoras++;
            //this.computadoras[ this.contadorComputadoras++ ] = new Computadora();
            this.computadoras[ this.contadorComputadoras++ ] = computadora;
            /*System.out.println(
                    "Computadora " + contadorComputadoras + 
                    " agregada a la orden " + idOrden + 
                    ": " + computadora.toString());*/
        }
        else{
            System.out.println("Ya no se pueden agregar computadoras a la orden");
        }
    }
    
    public double calcularTotal(){
        System.out.println("Numero de computadoras: " + this.contadorComputadoras);
        double total = 0.0;
        for(int i=0; i<this.contadorComputadoras; i++ ){
            System.out.println("computador n" + i + ": ");
            System.out.println(computadoras[i].toString());
            total += computadoras[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.print("Orden: " + this.idOrden + "; ");
        for(int i=0; i<this.contadorComputadoras; i++ ){
            System.out.println(this.computadoras[i]);
        }
    }
}
