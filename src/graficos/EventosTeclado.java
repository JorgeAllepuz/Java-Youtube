package graficos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosTeclado {
    public static void main(String[] args){
        MarcoConTeclas marco_teclas=new MarcoConTeclas();
        marco_teclas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTeclas extends JFrame{
    public MarcoConTeclas(){
        setVisible(true);
        setTitle("Eventos de teclado");
        setBounds(700,300,600,450);
        EventoDeTeclado tecla=new EventoDeTeclado();
        addKeyListener(tecla);
    }
}

class EventoDeTeclado implements KeyListener{

    public void keyPressed(KeyEvent e) {
        int codigo=e.getKeyCode();
        System.out.println(codigo);
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}
    
}
