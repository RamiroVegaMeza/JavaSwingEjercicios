
package domain;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//PRINCIPAL
public class PruebaTexto{
    
    public static void main(String[] args) {
        MarcoTexto miMarco = new MarcoTexto();
        
        miMarco.setVisible(true);
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
}

//FRAMES
class MarcoTexto extends JFrame{
    
    
    public MarcoTexto(){
        setTitle("Botones y Eventos");
        
        setBounds(700,300,500,300);
        
        LaminaTexto lamina = new LaminaTexto();
        add(lamina);
    }
}

//LAMINAS
class LaminaTexto extends JPanel {
    private JTextField campo1;
    
    public LaminaTexto(){
        JLabel texto1 =new JLabel("Emaill :");
        add(texto1);
        campo1 = new JTextField(20);
        add(campo1);
        JButton miboton = new JButton("Comprobar");
        DameTexto miEvento = new DameTexto();
        miboton.addActionListener(miEvento);
        add(miboton);
    }
    
    private class DameTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(campo1.getText().trim());
        }
        
    }

}







