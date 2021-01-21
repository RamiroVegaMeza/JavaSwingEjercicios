package domain;


import java.awt.event.*;
import javax.swing.*;


public class Varios_oyentes {
    public static void main(String[] args) {
        Marco_Principal miMarco= new Marco_Principal();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class Marco_Principal extends JFrame{
    
    public Marco_Principal(){
        setTitle("prueba varios");
        setBounds(1300,100,300,200);
        lamina_Principal lamina = new lamina_Principal();
        add(lamina);
        
    }
}
class lamina_Principal extends JPanel{
    public lamina_Principal(){
        JButton boton_nuevo = new JButton("Nuevo");
        add(boton_nuevo);
        boton_cerrar= new JButton("cerrar todo");
        add(boton_cerrar);
        OyenteNuevo oyente = new OyenteNuevo();
        boton_nuevo.addActionListener(oyente);
        
    }
    private class OyenteNuevo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        Marco_Emergente marco= new Marco_Emergente(boton_cerrar);
        marco.setVisible(true);
        }
        
    }
    JButton boton_cerrar;
}
class Marco_Emergente extends JFrame{
    public Marco_Emergente(JButton boton_cerrar){
        contador++;
        setTitle("Ventana "+ contador);
        setBounds(40*contador,4*contador,300,150);
        cierraMarco oyenteCerrar=new cierraMarco();
        boton_cerrar.addActionListener(oyenteCerrar);
    }
    private class cierraMarco implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        dispose();
        Marco_Emergente.contador=0;
        }
    }
    private static int contador=0;
}