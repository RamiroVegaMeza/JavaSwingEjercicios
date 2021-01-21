
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
    }
    JButton boton_cerrar;
}