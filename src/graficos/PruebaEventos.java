package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JFrame;

public class PruebaEventos {
    public static void main(String[] args){
        MarcoBotones mimarco=new MarcoBotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}

class MarcoBotones extends JFrame{
    public MarcoBotones(){
        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotones milamina=new LaminaBotones();
        add(milamina);

        
    }
}

class LaminaBotones extends JPanel{
    JButton botonAzul=new JButton("Azul");
    JButton botonAmarillo=new JButton("Amarillo");
    JButton botonRojo=new JButton("Rojo");

    public LaminaBotones(){
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        ColorFondo Azul=new ColorFondo(Color.BLUE);
        ColorFondo Amarillo=new ColorFondo(Color.YELLOW);
        ColorFondo Rojo=new ColorFondo(Color.RED);


        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Amarillo);
        botonRojo.addActionListener(Rojo);
    }

    private class ColorFondo implements ActionListener{
        public ColorFondo(Color c){
            colorDeFondo=c;
        }

        public void actionPerformed(ActionEvent e){
            setBackground(colorDeFondo);
        }
        private Color colorDeFondo;
    }

    
   
}

   


