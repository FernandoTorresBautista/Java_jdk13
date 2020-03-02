package com.ftb.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTaclados;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTaclados;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "idTeclado=" + idTeclado + '}';
    }
    
    
}
