package recursos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LaminaCalculadora extends JPanel {

    //variables locales
    private JPanel milamina2;
    private JButton pantalla;
    private boolean principio;
    private double resultado;
    private String ultimaOperacion;

    //constructor
    public LaminaCalculadora() {

        principio = true;

        setLayout(new BorderLayout());

        milamina2 = new JPanel();

        pantalla = new JButton("0");

        pantalla.setEnabled(false);

        add(pantalla, BorderLayout.NORTH);

        milamina2.setLayout(new GridLayout(4, 5));

        ActionListener insertar = new InsertaNumero();
        ActionListener orden = new Accionorden();
        ActionListener ordenBorrar = new AccionBorrar();
        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);

        ponerBoton("/", orden);
        ponerBoton("C", ordenBorrar);

        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);

        ponerBoton("X", orden);

        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);

        ponerBoton("-", orden);

        ponerBoton("0", insertar);
        ponerBoton(".", insertar);

        ponerBoton("=", orden);

        ponerBoton("+", orden);

        add(milamina2, BorderLayout.CENTER);
        ultimaOperacion = "=";

    }//constructor

    //METODOS
    private void calcular(double tecla) {

        if (ultimaOperacion.equals("+")) {
            resultado += tecla;
        } else if (ultimaOperacion.equals("-")) {
            resultado -= tecla;
        } else if (ultimaOperacion.equals("X")) {
            resultado *= tecla;
        } else if (ultimaOperacion.equals("/")) {
            resultado /= tecla;
        } else if (ultimaOperacion.equals("=")) {
            resultado = tecla;
        }

        pantalla.setText("" + resultado);
    }//calcular

    private void ponerBoton(String nombre, ActionListener oyente) {

        JButton boton = new JButton(nombre);
        //ponerlos a la escucha
        boton.addActionListener(oyente);
        milamina2.add(boton);

    }//ponerBoton

    //CLASES INTERNAS
    private class Accionorden implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String operacion = e.getActionCommand();

            calcular(Double.parseDouble(pantalla.getText()));

            ultimaOperacion = operacion;

            principio = true;

        }
    }//Accionorden

    private class InsertaNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String entrada = e.getActionCommand();

            if (principio) {

                pantalla.setText("");

                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada);
        }

    }//InsertaNumero
    
    private class AccionBorrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            pantalla.setText("0");
            principio = true;

        }

    }//AccionBorrar

}//fin clase principal
