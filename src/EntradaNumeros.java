import javax.swing.*;
public class EntradaNumeros {
    public static void main(String[] args){
        
        String num1=JOptionPane.showInputDialog("Introduce un número");
        Double num2=Double.parseDouble(num1);

        System.out.print("La raiz cuadrada de " + num2 + " es ");
        System.out.printf("%1.2f", Math.sqrt(num2));
        
        
        double x=10000.0;

        System.out.println(x/3); // Nos devuelve un resultado con muchos decimales.
        System.out.printf("%1.2f", x/3); // Nos devuelve un resultado con dos decimales.



    }
}
