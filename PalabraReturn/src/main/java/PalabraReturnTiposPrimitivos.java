// 14: Uso de la palabra return en java
// Tipos primivitvos y palabra void
public class PalabraReturnTiposPrimitivos {
    public static void main(String[] args) {
        sumarSinRetornar(3, 6);
        
        int r = sumarRetornandoValor(3, 6);
        System.out.println("r: " + r);
    }

    private static void sumarSinRetornar(int a, int b) {
        System.out.println( "Suma: " + (a+b) );
    }
    
    private static int sumarRetornandoValor(int a, int b){
        if( a==0 && b==0 ){
            System.out.println("Debe proporcionar valores distintos de cero");
            return 0;
        }
        return a+b;
    }
}
