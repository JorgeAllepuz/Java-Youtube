package graficos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.*;


public class TrabajandoColores {
    public static void main(String[] args){
        MarcoConColor mimarco=new MarcoConColor();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
        
    }
}

class MarcoConColor extends JFrame{
    public MarcoConColor(){
        setTitle("Prueba con colores");
        setSize(400, 400);
        LaminaConColor milamina=new LaminaConColor();
        add(milamina);
        milamina.setBackground(Color.CYAN);
    }
}

class LaminaConColor extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;

        // Dibujo rectangulo
        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
        g2.setPaint(Color.RED);
        g2.fill(rectangulo);
        g2.setPaint(Color.MAGENTA);
        g2.draw(rectangulo);
        //g2.draw(rectangulo);
        
        // Dibujo elipse
        Ellipse2D elipse=new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setPaint(new Color(109,172,59).brighter());
        //g2.draw(elipse);
        g2.fill(elipse);
        }
}
