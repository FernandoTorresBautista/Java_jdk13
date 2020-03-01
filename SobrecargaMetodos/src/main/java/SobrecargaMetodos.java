// 21 Sobrecarga de metodos
public class SobrecargaMetodos {
    public static void main(String[] args) {
        System.out.println("R1 (int, int): " + Operaciones.sumar(1, 2));
        System.out.println("R2 (double, double): " + Operaciones.sumar(2.0, 3.0));
        System.out.println("R3 (int, double): " + Operaciones.sumar(2, 4.0));
        System.out.println("R4 (double, int): " + Operaciones.sumar(5.0, 8));
        //
        System.out.println("R5 (int, long): " + Operaciones.sumar(2, 4L));
        System.out.println("R6 (float, char): " + Operaciones.sumar(5F, 'A'));
    }
}
