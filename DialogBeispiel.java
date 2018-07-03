import javax.swing.*;

public class DialogBeispiel
{
    // main-Methode
    public static void main(String[] args)
    {
        // Erzeugung eines neuen Frames mit 
        // dem Titel Beispiel JDialog
        JDialog meinJDialog = new JDialog();
        // Titel wird gesetzt
        meinJDialog.setTitle("Mein JDialog Beispiel");
        // Breite und Höhe des Fensters werden 
        // auf 200 Pixel gesetzt
        meinJDialog.setSize(200,200);
        // Dialog wird auf modal gesetzt
        meinJDialog.setModal(true);
        // Wir lassen unseren Dialog anzeigen
        meinJDialog.add(new JLabel("lorem ipsum"));
        meinJDialog.setVisible(true);
    }
}