package domain;

import javax.swing.*;
import java.awt.event.*;

public class Eventos_Ventanas {

    public static void main(String[] args) {
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setTitle("VENTANA 1");
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setBounds(300,300,500,350);
        
        MarcoVentana miMarco2 = new MarcoVentana();
        miMarco2.setTitle("VENTANA 2");
        miMarco2.setBounds(900,300,500,350);
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class MarcoVentana extends JFrame{
    
    public MarcoVentana(){
        //setTitle("Respondiendo");
        //setBounds(300,300,500,350);
        setVisible(true);
        M_Ventana oyenteVentana = new M_Ventana();
        addWindowListener(oyenteVentana);
    }
    
}

class M_Ventana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana Abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando Ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("La Ventana ha sido Cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana Restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana Activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana Desactivada");
    }
}