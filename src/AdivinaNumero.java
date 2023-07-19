import java.util.*;

public class AdivinaNumero {
    public static void main(String[] args){
        int numeroAleatorio=(int)(Math.random()*100);
        System.out.println(numeroAleatorio);

        Scanner entrada=new Scanner(System.in);
        int numero=0;
        int intentos=0;
        
        while (numero!=numeroAleatorio){
            intentos++;
            System.out.println("Introduce un número, por favor");
            numero=entrada.nextInt();

            if (numeroAleatorio<numero){
                System.out.println("más bajo");
            }
            else if(numeroAleatorio>numero){
                System.out.println("más alto");
            }
        }
        System.out.println("Número correcto, lo has conseguido en " + intentos + " intentos");
    }
}
