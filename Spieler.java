import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Spieler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spieler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int steinAnzahl;
    private String name;
    private Boolean aktiv;
    private int siegPunkte;
    //private String handkarten[];
    private int handkartenAnzahl;
    ArrayList<String> handkarten = new ArrayList<String>();
    /**
     * Konstruktor für Objekte der Klasse Spieler
     */
    public Spieler(String name)
    {
        this.steinAnzahl=45;
        this.siegPunkte=0;
        this.name = name;
        this.aktiv=false;
        this.handkartenAnzahl=0;
        //this.handkarten=new String[35];
    }

    public void steinAnzahlSetzen(int steinAnzahl) {
        this.steinAnzahl=steinAnzahl;
    }

    public int steinAnzahlGeben()   {
        return this.steinAnzahl;
    }
    
    public void siegPunkteSetzen(int siegPunkte)    {
        this.siegPunkte=siegPunkte;
    }
    
    public int siegPunkteGeben()    {
        return this.siegPunkte;
    }
    
    public void aktivSetzen()   {
        this.aktiv=true;
    }

    public String nameGeben()   {
        return this.name;
    }
    public int handkartenAnzahlGeben()  {
        return this.handkartenAnzahl;
    }
    public void handkartenAnzahlSetzen(int handkartenAnzahl)    {
        this.handkartenAnzahl=handkartenAnzahl;
    }
    public void karteAufnehmen(String karte){
        handkarten.add(karte);
        handkartenAnzahl=handkartenAnzahl++;
    }

}
