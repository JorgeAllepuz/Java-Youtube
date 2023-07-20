import javax.swing.*;
public class UsoArraysIII {
    public static void main(String[] args){

        String [] paises=new String[8];

        //String [] paises={"España","México","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela"};

        for (int i=0;i<8;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce país " + (i+1));
        }

        for(String elemento:paises){
            System.out.println("País: " + elemento);
        }
    }
    
}
