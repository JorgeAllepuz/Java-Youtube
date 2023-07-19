import javax.swing.*;

public class Factorial {
    public static void main(String[] args){
        Long resultado=1L; // Declarar la variable como long nos permite que acepte un resultado mas grande que con int
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

        for (int i=numero;i>0;i--){
            resultado=resultado*i;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);

    }
}
