import javax.swing.JOptionPane;

public class UsoBucleFor {
    public static void main(String[] args){

        boolean arroba=false;
        boolean punto=false;
        int numArroba=0;
        String eMail=JOptionPane.showInputDialog("Introduce el email");

        for (int i=0;i<eMail.length();i++){
            if(eMail.charAt(i)=='@'){
                arroba=true;
                numArroba++;
            }
            if(eMail.charAt(i)=='.'){
                punto=true;
            }

        }
        if(arroba==true && punto==true && numArroba==1){
            System.out.println("El email es correcto");
        }
        else{
            System.out.println("El email no es correcto");
        }

    }

}
