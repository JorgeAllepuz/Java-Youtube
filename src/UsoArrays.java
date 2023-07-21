import java.util.Arrays;

public class UsoArrays {
    public static void main(String[] args){

        // Manera 1 de declarar una matriz o array
        /*int [] mi_matriz=new int [5];
        //int mi_matriz []=new int [5]; // Tambien se puede declarar la matriz colocando los corchetes delante
        
        mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=-15;
        mi_matriz[3]=92;
        mi_matriz[4]=71;*/

        // Manera 2 de declarar una matriz
        int [] mi_matriz={5,38,-15,92,71,25,46,46,16,81,64,974,2,1,-23};

        for (int i=0;i<mi_matriz.length;i++){
            System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);
        }
    }
}
