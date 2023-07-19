import java.util.*;

public class EntradaEjemplo1 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);  // Instanciar una clase
        System.out.println("Introduce tu nombre, por favor");
        String nombre_usuario=entrada.nextLine();
        System.out.println("Introduce tu edad, por favor");
        int edad=entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + " tienes una edad de " + edad + " años");

    }
}
