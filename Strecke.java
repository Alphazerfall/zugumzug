
public class Strecke
{

    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int laenge, typ;
    private Spieler besitz;

    public Strecke(int laenge,int typ){
        this.laenge=laenge;
        this.typ=typ;
    }

    public void besitzSetzen(Spieler besitzer)   
    {
        this.besitz=besitzer;
    }

    public Spieler besitzGeben()    
    {
        return this.besitz;
    }

    public int laengeGeben()    
    {
        return this.laenge;
    }

    public int typGeben()
    {
        return this.typ;
    }
}
