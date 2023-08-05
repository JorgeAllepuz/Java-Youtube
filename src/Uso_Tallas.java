import java.util.*;

public class Uso_Tallas {
    enum Talla {Pequeña, Mediana, Grande, Muy_grande}; // Con enum, enumeramos las variables de tipo talla para que solo admitan ese tipo de tallas
    public static void main(String[] args){
        Talla s=Talla.Pequeña;
        Talla m=Talla.Mediana;
        Talla l=Talla.Grande;
        Talla xl=Talla.Muy_grande;

        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce una talla por favor:");
        String tallaIntroducida=entrada.nextLine();

        if (tallaIntroducida.equals("Pequeña")){
            System.out.println("La talla introducida es S");
        }else if (tallaIntroducida.equals("Mediana")){
            System.out.println("La talla introducida es M");
        }else if (tallaIntroducida.equals("Grande")){
            System.out.println("La talla introducida es L");
        }else if (tallaIntroducida.equals("Muy grande")){
            System.out.println("La talla introducida es XL");
        }else{
            System.out.println("La talla introducida no es valida");
        }





    }
}
