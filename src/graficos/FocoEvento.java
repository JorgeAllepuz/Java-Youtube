package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.event.*;

public class FocoEvento {
    public static void main(String[] args){
        MarcoFoco mimarco=new MarcoFoco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoFoco extends JFrame{
    public MarcoFoco(){
        LaminaFoco milamina=new LaminaFoco();
        add(milamina);
        setVisible(true);
        setBounds(300, 300, 600, 450);
    }
}

class LaminaFoco extends JPanel{
    public void paintComponent(Graphics g){
        setLayout(null);
        cuadro1=new JTextField();
        cuadro2=new JTextField();
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos elFoco=new LanzaFocos();
        cuadro1.addFocusListener(elFoco);
    }

    private class LanzaFocos implements FocusListener{

        public void focusGained(FocusEvent e){
            System.out.println("Has ganado el foco");
        }

        public void focusLost(FocusEvent e){
            cuadro1=(JTextField) e.getSource();
            System.out.println("Has perdido el foco");
            String email=cuadro1.getText();
            boolean comprobacion=false;

            for(int i=0;i<email.length();i++){
                if(email.charAt(i)=='@'){
                    comprobacion=true;
                }
            }
            if(comprobacion){
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
            }
        }


}
    JTextField cuadro1;
    JTextField cuadro2;

}






