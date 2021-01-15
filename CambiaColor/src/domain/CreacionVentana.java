
package domain;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//PRINCIPAL
public class CreacionVentana{
    
    public static void main(String[] args) {
        MarcoBotones miMarco = new MarcoBotones();
        
        miMarco.setVisible(true);
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
}

//FRAMES
class MarcoBotones extends JFrame{
    
    
    public MarcoBotones(){
        setTitle("Botones y Eventos");
        
        setBounds(700,300,500,300);
        
        LaminaBotones lamina = new LaminaBotones();
        add(lamina);
    }
}

//LAMINAS
class LaminaBotones extends JPanel {
    
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");
    
    public LaminaBotones(){
    add(botonAzul);
    add(botonAmarillo);
    add(botonRojo);
    
    ColorFondo Amarillo= new ColorFondo(Color.yellow);
    ColorFondo Azul= new ColorFondo(Color.blue);
    ColorFondo Rojo= new ColorFondo(Color.red);
    
    botonAzul.addActionListener(Azul); 
    botonAmarillo.addActionListener(Amarillo);
    botonRojo.addActionListener(Rojo);
    
    }
    
    private class ColorFondo implements ActionListener{
    
    private Color colorDeFondo;
    
    public ColorFondo(Color c){
        
        this.colorDeFondo=c;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(colorDeFondo);
    }

    }

}







