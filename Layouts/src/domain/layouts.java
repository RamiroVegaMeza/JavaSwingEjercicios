

package domain;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class layouts {
 public static void main(String[] args) {
        MarcoLayout miMarco = new MarcoLayout();
        
        miMarco.setVisible(true);
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
}

//FRAMES
class MarcoLayout extends JFrame{
    
    
    public MarcoLayout(){
        setTitle("Botones y Eventos");
        
        setBounds(700,300,500,300);
        
        Panel_Layout lamina = new Panel_Layout();
       // FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
        lamina.setLayout(new FlowLayout(FlowLayout.LEFT,75,70));
        add(lamina);
    }
}

//LAMINAS
class Panel_Layout extends JPanel {

    public Panel_Layout(){
    add(new JButton("Amarillo"));
    add(new JButton("Rojo"));
    add(new JButton("Azul"));

    
    }
    


}
