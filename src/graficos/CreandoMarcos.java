package graficos;
import java.awt.Frame;

import javax.swing.*;


public class CreandoMarcos {
    public static void main(String[] args){
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //marco1.setLocation(2000, 500);
        //marco1.setBounds(2000, 500, 100, 100);
    }
}

class miMarco extends JFrame{
    public miMarco(){
        //setSize(500, 300);
        //setLocation(500,300);
        setBounds(500, 300, 500, 500);
        //setResizable(false);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Mi ventana");
        
    }
}
