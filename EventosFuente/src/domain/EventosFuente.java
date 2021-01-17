package domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventosFuente {

    public static void main(String[] args) {
        MarcoAccion miMarco = new MarcoAccion();

        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoAccion extends JFrame {

    public MarcoAccion() {
        setTitle("Acciones");

        setBounds(600, 350, 600, 350);

        PanelAccion lamina = new PanelAccion();
        add(lamina);
    }

}

class PanelAccion extends JPanel {

    public PanelAccion() {

        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/amarillo.png"), Color.yellow);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/azul.png"), Color.blue);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/rojo.png"), Color.red);

        JButton botonAmarillo = new JButton(accionAmarillo);
        JButton botonAzul = new JButton(accionAzul);
        JButton botonRojo = new JButton(accionRojo);

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
        /**
         * JButton botonAmarillo = new JButton("Amarillo");
         *
         * JButton botonAzul = new JButton("Azul");
         *
         * JButton botonRojo = new JButton("Rojo");
         *
         * add(botonAmarillo); add(botonRojo); add(botonAzul);
         *
         *
         */

        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        //KeyStroke teclaAmatillo=KeyStroke.getKeyStroke("ctrl A");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl C"), "fondo_rojo");

        ActionMap mapaAccion = getActionMap();
        
        mapaAccion.put("fondo_amarillo", accionAmarillo);
        mapaAccion.put("fondo_azul", accionAzul);
        mapaAccion.put("fondo_rojo", accionRojo);
    }

    private class AccionColor extends AbstractAction {

        public AccionColor(String nombre, Icon icono, Color color_boton) {

            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color: " + nombre);
            putValue("color_de_fondo", color_boton);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("color_de_fondo");
            setBackground(c);

            System.out.println("Nombre: " + getValue(Action.NAME) + " Descripcion: " + " " + getValue(Action.SHORT_DESCRIPTION));

        }

    }
}
