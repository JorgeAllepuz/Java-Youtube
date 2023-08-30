package graficos;
import java.awt.event.*;

import javax.swing.JFrame;

public class Eventos_Raton {
    public static void main(String[] args){
        MarcoRaton mimarco=new MarcoRaton();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoRaton extends JFrame{
    public MarcoRaton(){
        setVisible(true);
        setBounds(700,300,600,450);
        EventosDeRaton EventoRaton=new EventosDeRaton();
        addMouseListener(EventoRaton);
        addMouseMotionListener(EventoRaton);
    }
}

class EventosDeRaton extends MouseAdapter implements MouseMotionListener {

    /*public void mouseClicked(MouseEvent e){
        System.out.println("Has hecho click");
        System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
    
        System.out.println("El numero de pulsaciones es: " + e.getClickCount());    
    }

    public void mousePressed(MouseEvent e){
        System.out.println("Acabas de presionar");
    }

    public void mouseReleased(MouseEvent e){
        System.out.println("Acabas de levantar el dedo");
    }

    public void mouseExited(MouseEvent e){
        System.out.println("Acabas de salir");
    }

    public void mouseEntered(MouseEvent e){
        System.out.println("Acabas de entrar");
    }*/

    public void mousePressed(MouseEvent e){

        System.out.println(e.getModifiersEx());
        if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Has pulsado el boton izquierdo");
        }else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("Has pulsado la rueda del raton");
        }else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Has pulsado el boton derecho del raton");
        }
    }

    public void mouseDragged(MouseEvent e){
        System.out.println("Estas arrastrando el raton");
    }

    public void mouseMoved(MouseEvent e){
        System.out.println("Estas moviendo el raton");
    }
}


