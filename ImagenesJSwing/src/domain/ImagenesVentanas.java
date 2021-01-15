

package domain;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ImagenesVentanas {
    public static void main(String[] args) {
        Marco marco=new Marco();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//FRAME
class Marco extends JFrame{
    
    
    public Marco(){
        setTitle("Imagenes");
        
        setBounds(700,300,500,300);
        
        Lamina lamina = new Lamina();
        add(lamina);
    }
}

class Lamina extends JPanel{
    
    private Image imagen;
    
    public void paintComponent(Graphics g){
    
        try {
            File miimagen =new File("src/imagenes/carro.png");
            imagen=ImageIO.read(miimagen);
        } catch (IOException ex) {
            System.out.println("No se pudo cargar la imagen");
        }
        //dibujamos la imagen
        g.drawImage(imagen,5,5,null);
    
    }
    
 }

