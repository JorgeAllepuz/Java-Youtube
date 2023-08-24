package graficos;
import java.awt.*;
import java.time.temporal.JulianFields;

import javax.swing.*;

public class TrabajandoConFuentes {
    public static void main(String[] args){
        MarcoConFuentes mimarco=new MarcoConFuentes();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }
}

class MarcoConFuentes extends JFrame{
    public MarcoConFuentes(){
        setTitle("Prueba con fuentes");
        setSize(400, 400);
        LaminaConFuentes milamina=new LaminaConFuentes();
        add(milamina);
        milamina.setForeground(Color.BLUE); // Establece el mismo color a todo el texto de la lamina
        milamina.setBackground(Color.CYAN); // Establece el color a todo el fondo de la lamina
    }
}

class LaminaConFuentes extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        Font mifuente=new Font("Gargi", Font.BOLD, 26);
        g2.setFont(mifuente);
        //g2.setColor(Color.BLUE);
        g2.drawString("Jorge", 100, 100);

        g2.setFont(new Font("Arial", Font.ITALIC, 24));
        //g2.setColor((new Color(100, 50, 22).darker()));
        g2.drawString("Curso Java", 100, 20);
    }
}
