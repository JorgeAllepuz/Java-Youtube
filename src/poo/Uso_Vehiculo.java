package poo;
import javax.swing.*;


public class Uso_Vehiculo {
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


        Coche miCoche1=new Coche();

        miCoche1.establece_color("Rojo");

        Furgoneta mifFurgoneta1=new Furgoneta(7, 580);
        mifFurgoneta1.establece_color("Azul");
        mifFurgoneta1.configura_asientos("si");
        mifFurgoneta1.configura_climatizador("si");

        System.out.println(miCoche1.dime_datos_generales() + " " + miCoche1.dime_color());
        System.out.println(mifFurgoneta1.dime_datos_generales() + mifFurgoneta1.dimeDatosFurgoneta());
        
    }

    
    
}
