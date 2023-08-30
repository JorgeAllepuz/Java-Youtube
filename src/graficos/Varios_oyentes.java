package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;


public class Varios_oyentes {
    public static void main(String[] args){
        Marco_Principal mimarco=new Marco_Principal();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Marco_Principal extends JFrame{
    public Marco_Principal(){
        setTitle("Prueba Varios");
        setBounds(1300, 100, 300, 200);
        Lamina_Principal lamina=new Lamina_Principal();
        add(lamina);
    }
}

class Lamina_Principal extends JPanel{
    public Lamina_Principal(){
        JButton boton_nuevo=new JButton("Nuevo");
        add(boton_nuevo);
        boton_cerrar=new JButton("Cerrar todo");
        add(boton_cerrar);
        OyenteNuevo miOyente=new OyenteNuevo();
        boton_nuevo.addActionListener(miOyente);
    }

    private class OyenteNuevo implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Marco_Emergente marco=new Marco_Emergente(boton_cerrar);
            
        }
    }
    JButton boton_cerrar;
}

class Marco_Emergente extends JFrame{
    public Marco_Emergente(JButton boton_de_principal){
        contador++;
        setTitle("Ventana " + contador);
        setBounds(40*contador, 40*contador, 300, 150);
        setVisible(true);
        CierraTodos oyenteCerrar=new CierraTodos();
        boton_de_principal.addActionListener(oyenteCerrar);

    }

    private class CierraTodos implements ActionListener{
        public void actionPerformed(ActionEvent e){
            dispose();
            contador=0;
        }
    }
    private static int contador=0;

}
