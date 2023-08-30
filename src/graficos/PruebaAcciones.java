package graficos;
import java.awt.Color;
import java.awt.event.*;
import java.util.concurrent.ForkJoinPool;

import javax.swing.*;


public class PruebaAcciones {
    public static void main(String[] args){
        MarcoAccion marco=new MarcoAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}

class MarcoAccion extends JFrame{
    public MarcoAccion(){
        setTitle("Prueba acciones");
        setBounds(600,350,600,300);
        PanelAccion lamina=new PanelAccion();
        add(lamina);
    }
}

class PanelAccion extends JPanel{
    public PanelAccion(){
        KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
        KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl B");
        KeyStroke teclaRojo=KeyStroke.getKeyStroke("ctrl R");
        AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/iconoamarillo.gif"), Color.YELLOW, teclaAmarillo);
        AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/iconoazul.gif"), Color.BLUE, teclaAzul);
        AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/iconorojo.gif"), Color.RED, teclaRojo);
        
        /*JButton botonAmarillo=new JButton(accionAmarillo);
        add(botonAmarillo);*/

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));

        /*JButton botonAmarillo=new JButton("Amarillo");
        JButton botonAzul=new JButton("Azul");
        JButton botonRojo=new JButton("Rojo");
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);*/

        InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        
        mapaEntrada.put(teclaAmarillo, "fondo_amarillo");

        
        mapaEntrada.put(teclaAzul, "fondo_azul");


        mapaEntrada.put(teclaRojo, "fondo_rojo");


        ActionMap mapaAccion=getActionMap();
        mapaAccion.put("fondo_amarillo", accionAmarillo);
        mapaAccion.put("fondo_azul", accionAzul);
        mapaAccion.put("fondo_rojo", accionRojo);


    }
    private class AccionColor extends AbstractAction{

        public AccionColor(String nombre, Icon icono, Color color_boton, KeyStroke tecla){
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            String keyStrokeText=tecla.toString();
            putValue(Action.SHORT_DESCRIPTION, keyStrokeText + " Poner la lamina de color " + nombre);
            putValue("Color_de_fondo", color_boton);
        }
    

        public void actionPerformed(ActionEvent e){
            Color c=(Color)getValue("Color_de_fondo");
            setBackground(c);
            System.out.println("Nombre: " + getValue(Action.NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
        }
    }   

}




