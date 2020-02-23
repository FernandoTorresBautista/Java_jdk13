// 14:
//  Return usando tipos Object
public class PalabraReturnClases {
    public static void main(String[] args) {
        Suma s = creaObjetoSuma();
        
        System.out.println("Suma: " + s.sumar());
    }

    private static Suma creaObjetoSuma() {
        Suma su = new Suma(4, 6);
        return su;//new Suma(4, 6);
    }
    
}

class Suma{
    int a;
    int b;
    public Suma(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int sumar(){
        return this.a + this.b;
    }
}