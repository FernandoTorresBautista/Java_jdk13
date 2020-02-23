// 12: Memoria stack y heap 
// 13: Paso por Valor y Paso por Referencia en java
public class PasoPorValor {
    public static void main(String[] args) {
        // tipos primitivos
        var x = 10;
        System.out.println("x: " + x);
        // se envia una copia
        carbiarValor(x); // 20
        System.out.println("x: " + x); // 10
    }

    private static void carbiarValor(int arg) {
        arg = 20;// variable local
        System.out.println("arg: " + arg);
    }
}
