// S18: Contexto Estático en java(uso de la palabra static)
// 
public class EjemploEstatico {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Fernando");
        System.out.println("Persona: " + persona1);//se llama toString automaticamente
        //
        Persona persona2 = new Persona("Fer");
        System.out.println("Persona 2: " + persona2);//se llama toString automaticamente
        //
        Persona persona3 = new Persona("Torres");
        System.out.println("Persona 3: " + persona3);//se llama toString automaticamente
        //
        System.out.println("Contador personas: " + Persona.getContadorPersona());
    }
}
