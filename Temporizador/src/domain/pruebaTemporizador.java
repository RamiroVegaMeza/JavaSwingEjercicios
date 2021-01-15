package domain;

import java.awt.Toolkit;
import java.awt.event.*;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.*;

public class pruebaTemporizador {
    public static void main(String[] args) {
            DameLaHora oyente = new DameLaHora();
             
            Timer miTemporizador = new Timer(5000, oyente);
    
           miTemporizador.start();
           
           JOptionPane.showMessageDialog(null,"PULSA ACCEPTAR PARA DETENER");
           
           System.exit(0);
    }
}

class DameLaHora implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Date ahora = new Date();
        
        System.out.println("Transcurrieron 5 segundos " + ahora);
    
        Toolkit.getDefaultToolkit().beep();
    }
}
