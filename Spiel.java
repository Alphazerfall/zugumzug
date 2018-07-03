import javax.swing.*;
import java.util.Random;
public class Spiel
{
    Main spiel;
    public Spiel()   {
        
        spiel = new Main(Integer.parseInt(JOptionPane.showInputDialog("Anzahl der Spieler ")));
    }
}

