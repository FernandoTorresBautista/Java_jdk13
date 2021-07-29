package enumeracion;

/**
 * @author Fer
 */
public enum Continentes {
    AFRICA(53), 
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OSEANIA(14);
    
    private final int paises;
    
    Continentes(int paises) {
        this.paises = paises;
    }
    
    public int getPaises() {
        return this.paises;
    }
            
}
