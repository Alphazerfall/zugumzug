import javax.swing.*;
import java.util.Random;
/**
 * Klasse Main 
 * @author Felix, Florian, Denis
 */
public class Main
{
    Strecke streckenliste[][];
    String stationsliste[];
    Spieler spielerliste[];

    Kartenstapel nachziehstapel;
    Kartenstapel ablagestapel;
    Kartenstapel offenstapel;

    public Main(int spielerAnzahl)
    {
        
        //spielerAnzahl=3;//startet bei 0!
        spielerliste = new Spieler[spielerAnzahl];//Spielerliste wird initialisiert
        for(int z=0;z<spielerAnzahl;z++)
        {
            spielerliste[z]=new Spieler(JOptionPane.showInputDialog("Name von Spieler " +z));
        }
        spielerliste[0].aktivSetzen();
        
        // Stationsliste wird initialisiert und gefüllt
        stationsliste = new String[]{"Schule","Kirche","Parkplatz"};
        //Streckenliste wird initialisiert
        streckenliste = new Strecke[3][3];
        //jedes Element wird gleich null gesetzt
        for(int x1=0;x1<stationsliste.length-1;x1++)
        {
            for(int x2=0;x2<stationsliste.length-1;x2++) 
            {
                streckenliste[x1][x2]=null;
            }
        }
        //Strecken werden eingefügt
        this.streckeHinzufuegen(0, 1, 10, 1);
        this.streckeHinzufuegen(0, 2, 20, 2);
        this.streckeHinzufuegen(2, 1, 21, 3);

        nachziehstapel = new Kartenstapel();
        ablagestapel = new Kartenstapel();
        offenstapel = new Kartenstapel();
        nachziehstapel.neuerStapel();
        
        //offene Karten fuellen
        this.offenFuellen();
    }

    
    
    
    
    
    
    public void streckeHinzufuegen(int x1,int x2,int laenge, int typ)
    {
        streckenliste[x1][x2]=new Strecke(laenge, typ);
        streckenliste[x2][x1]=new Strecke(laenge, typ);
    }

    public void streckeNutzen(int aktiverSpieler,int x1, int x2)
    {
        if (spielerliste[aktiverSpieler].steinAnzahlGeben()>=streckenliste[x1][x2].laengeGeben()) {
            streckenliste[x1][x2].besitzSetzen(spielerliste[aktiverSpieler]);
            streckenliste[x2][x1].besitzSetzen(spielerliste[aktiverSpieler]);
            spielerliste[aktiverSpieler].steinAnzahlSetzen(spielerliste[aktiverSpieler].steinAnzahlGeben()-streckenliste[x1][x2].laengeGeben());
            spielerliste[aktiverSpieler].siegPunkteSetzen(spielerliste[aktiverSpieler].siegPunkteGeben()+streckenliste[x1][x2].laengeGeben());
        }   
    }

    public void verdeckteKarteZiehen()  {
        String tempVar;
        if(nachziehstapel.kartenliste.size()!=0)    {
            tempVar=nachziehstapel.karteZiehen();
        }
        else
            if(ablagestapel.kartenliste.size()!=0)
                {tempVar=ablagestapel.karteZiehen();}

    }

    public String offeneKarteZiehen(int gewaehlteKarte){
        String tempVar;
        tempVar=offenstapel.kartenliste.get(gewaehlteKarte);
        offenstapel.kartenliste.remove(gewaehlteKarte);
        return tempVar;
    }

    public void offenFuellen()
    {
        for(int x1=0;x1<3;x1++) {//drei offene Karten zur Auswahl
            if(offenstapel.groesseGeben()<3) {
                if(nachziehstapel.kartenliste.size()!=0)    {
                    offenstapel.kartenliste.add(this.offeneKarteSetzen());
                }
                else
                if(ablagestapel.kartenliste.size()!=0)
                {offenstapel.kartenliste.add(this.offeneKarteSetzen());}

            }
        }
    }

    public String offeneKarteSetzen(){
        String tempVar=null;
        if(nachziehstapel.kartenliste.size()!=0)
        {tempVar=nachziehstapel.karteZiehen();}
        else
        if(ablagestapel.kartenliste.size()!=0)
        {tempVar=ablagestapel.karteZiehen();}
        return tempVar;
    }

    public String offeneKartenGeben(){
        return offenstapel.kartenliste.toString();
    }
}

