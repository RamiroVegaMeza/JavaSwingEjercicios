package domain;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Test {

    public static void main(String[] args) {
        Reloj reloj = new Reloj(3000, true);
        reloj.enMarcha();
        JOptionPane.showMessageDialog(null, "PULSAR ACEPTAR PARA TERMINAR");
        System.exit(0);
    }
}

class Reloj {

    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMarcha() {
        ActionListener oyente = new DameLaHora();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }
    
    //Clase interna
    private class DameLaHora implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora=new Date();
            System.out.println("Hora cada 3s");
            
            if(sonido){
                Toolkit.getDefaultToolkit().beep();
            }
           
        }
    
 }

}
