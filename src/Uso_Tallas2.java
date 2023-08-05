import java.util.*;

public class Uso_Tallas2 {
    // enum debe ser declarado fuera del main
    enum Talla{
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        

        private Talla(String abreviatura){ // Se declara el constructor private porque en enum se debe crear en private al no poder instanciarse en otra clase.
            this.abreviatura=abreviatura;
        }
        private String abreviatura;

        public String dameAbreviatura(){
            return abreviatura;
        }
    }
    
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String entrada_datos=entrada.next().toUpperCase();


        Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);

        System.out.println("Talla= " + la_talla);
        System.out.println("Abreviatura= " + la_talla.dameAbreviatura());


    }
}
