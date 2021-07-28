// 23 Uso de la palabra final
package palabrafinal;

// ya no se crearan clases hijas de ésta clase
public final class ClaseFinal {
//public class ClaseFinal {
    // final variable
    public final int varNumero = 10;
    // constante en java
    public static final int VAR_PRIMITIVO = 10;
    // Objeto constante en java, la constante es la referencia a memoria
    public static final Persona VAR_PERSONA = new Persona();//  aún se pueden modificar sus atributos
    
    public final void metodoFinal(){}
}

// No se extiende al ser final la clase padre extendida
/*
//error
class claseHija extends ClaseFinal{
    public void metodoFinal(){} // No se puede ya que es final en la clase padre
}
*/
 