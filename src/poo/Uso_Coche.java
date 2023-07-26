package poo;
import javax.swing.*;


public class Uso_Coche {
    public static void main(String[] args){
        
        Coche miCoche=new Coche();


        System.out.println(miCoche.dime_datos_generales());

        //miCoche.establece_color("azul");// Comentamos para introducir los argumentos al ejecutar programa mediante JOptionpane
        miCoche.establece_color(JOptionPane.showInputDialog("Introduce color del coche"));
        System.out.println(miCoche.dime_color());

        //miCoche.configura_asientos("si");// Comentamos para introducir los argumentos al ejecutar programa mediante JOptionpane
        miCoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(miCoche.dime_asientos());

        //miCoche.configura_climatizador("si");// Comentamos para introducir los argumentos al ejecutar programa mediante JOptionpane
        miCoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));

        System.out.println(miCoche.dime_climatizador());

        System.out.println(miCoche.dime_peso_coche());

        System.out.println("El precio final del coche es: " + miCoche.dime_precio_coche());
    }

    
    
}
