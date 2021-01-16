
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.*;

public class CambioEstado {

    public static void main(String[] args) {
        MarcoEstado mimarco = new MarcoEstado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEstado extends JFrame {

    public MarcoEstado() {
        setVisible(true);
        setBounds(300, 300, 500, 350);
        CambiaEstado nuevo_estado = new CambiaEstado();
        addWindowStateListener(nuevo_estado);
    }
    
}

class CambiaEstado implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de estado");
        
        if (e.getNewState()==6) {
            System.out.println("La Ventana esta a pantalla completa");
        }
    }
   
}