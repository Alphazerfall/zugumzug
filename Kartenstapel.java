import java.util.Random;
import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Kartenstapel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kartenstapel
{
    ArrayList<String> kartenliste = new ArrayList<String>();
    int rotAnzahl;
    int gruenAnzahl;
    int gelbAnzahl;
    int taxiAnzahl;
    int kartenAnzahl;
    Random randomGenerator = new Random();
    public Kartenstapel()
    {

    }

    public void neuerStapel(){
        rotAnzahl=5;
        gruenAnzahl=5;
        gelbAnzahl=5;
        taxiAnzahl=3;
        kartenAnzahl=rotAnzahl+gruenAnzahl+gelbAnzahl+taxiAnzahl;

        for(int x1=0;x1<rotAnzahl;x1++)
        {
            kartenliste.add("rot");
        }

        for(int x1=0;x1<gruenAnzahl;x1++)
        {
            kartenliste.add("gruen");
        }

        for(int x1=0;x1<gelbAnzahl;x1++)
        {
            kartenliste.add("gelb");
        }

        for(int x1=0;x1<taxiAnzahl;x1++)
        {
            kartenliste.add("taxi");
        }
    }

    public String karteZiehen()
    {
        String tempVar=null;
        int randomInt = randomGenerator.nextInt(kartenliste.size());
        tempVar = kartenliste.get(randomInt);
        if(kartenliste.size()!=0)   {
            kartenliste.remove(randomInt);
        }
        return tempVar;
    }

    public void karteAufdecken()  {
        /**String tempVar=null;
        int randomInt = randomGenerator.nextInt(kartenAnzahl);

        if(kartenliste[randomInt]==null)    {
        karteZiehen();
        }   else    {
        offeneKarte = kartenliste[randomInt];
        kartenliste[randomInt]=null;
        }
         **/
    }
    
    public int groesseGeben(){
        return this.kartenliste.size();
    }

    /**public void ablageZuNachzieh()  {
        for(x1=ablagestapel
    }**/
}
