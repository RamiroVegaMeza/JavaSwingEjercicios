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
class MarcoLayout extends JFrame {

    public MarcoLayout() {
        setTitle("Botones y Eventos");

        setBounds(700, 300, 500, 300);

        Panel_Layout lamina = new Panel_Layout();
        // FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
        Panel_Layout2 lamina2 = new Panel_Layout2();
      
        add(lamina,BorderLayout.NORTH);
        add(lamina2,BorderLayout.SOUTH);
    }
}

//LAMINAS
class Panel_Layout extends JPanel {

    public Panel_Layout() {
       
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(new JButton("Amarillo"));
        
        add(new JButton("Rojo"));

    }

}

class Panel_Layout2 extends JPanel{
    public Panel_Layout2(){
        setLayout(new BorderLayout());
         add(new JButton("Azul"),BorderLayout.WEST);
         add(new JButton("verde"),BorderLayout.EAST);
         add(new JButton("Negro"),BorderLayout.CENTER);
    }
}
