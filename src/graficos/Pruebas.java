package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class Pruebas {
    public static void main(String[] args){
        String fuente=JOptionPane.showInputDialog("Introduce la fuente");
        boolean estaLaFuente=false;
        String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for(String nombredelafuente:nombresDeFuentes){
            System.out.println(nombredelafuente);

            if (nombredelafuente.equals(fuente)){
                estaLaFuente=true;
            }
        }
        if(estaLaFuente==true){
            System.out.println("Fuente instalada");
        }else{
            System.out.println("Fuente NO instalada");
        }
    }
}
