import javax.swing.*;
import java.awt.event.*;

public class Eventos_Ventanas {

    public static void main(String[] args) {
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoVentana extends JFrame{
    
    public MarcoVentana(){
        setTitle("Respondiendo");
        setBounds(300,300,500,350);
        setVisible(true);
        M_Ventana oyenteVentana = new M_Ventana();
        addWindowListener(oyenteVentana);
    }
    
}

class M_Ventana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana Axctivada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}