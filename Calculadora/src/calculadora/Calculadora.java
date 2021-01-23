
package calculadora;

import java.awt.*;
import javax.swing.*;



public class Calculadora {

    public static void main(String[] args) {
    MarcoCalculadora mimarco = new MarcoCalculadora();
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mimarco.setVisible(true);
        
    }
}
class MarcoCalculadora extends JFrame{
    
    public MarcoCalculadora(){
        setTitle("Calculadora");
        
        setBounds(500,300,450,300);
        
        LaminaCalculadora milamina = new LaminaCalculadora();
        add(milamina);
    }
}

class LaminaCalculadora extends JPanel{
    
    public LaminaCalculadora(){
        setLayout(new BorderLayout());
        milamina2 = new JPanel();
        
        JButton pantalla = new JButton("0");
        
        pantalla.setEnabled(false);
        
        add(pantalla,BorderLayout.NORTH);

        milamina2.setLayout(new GridLayout(4,4));
        
/**        forma 1:
        JButton boton1 = new JButton("1");
        milamina2.add(boton1);

        JButton boton2 = new JButton("2");
        milamina2.add(boton2);

        JButton boton3 = new JButton("2");
        milamina2.add(boton3);
         
         add(milamina2,BorderLayout.CENTER);
**/        

           //forma 2:
           ponerBoton("7");
           ponerBoton("8");
           ponerBoton("9");
           ponerBoton("/");
           ponerBoton("4");
           ponerBoton("5");
           ponerBoton("6");
           
           ponerBoton("X");
           ponerBoton("1");
           ponerBoton("2");
           ponerBoton("3");
           
           ponerBoton("-");
           ponerBoton("0");
           ponerBoton(".");
           ponerBoton("=");
           
           ponerBoton("+");
           
           add(milamina2,BorderLayout.CENTER);

    }
    
    private void ponerBoton(String nombre){
        
        JButton boton = new JButton(nombre);
        milamina2.add(boton);
    }
    private JPanel milamina2;
}