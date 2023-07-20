public class UsoArraysII {
    public static void main(String[] args) {
        String [] paises=new String[8];

        paises[0]="España";
        paises[1]="México"; 
        paises[2]="Colombia"; 
        paises[3]="Perú"; 
        paises[4]="Chile"; 
        paises[5]="Argentina"; 
        paises[6]="Ecuador"; 
        paises[7]="Venezuela";

        /*for (int i=0;1<paises.length;i++){
            System.out.println("Pais " + i + " = " + paises[i]);
        }*/
        for(String elemento:paises){ // Otra forma del bucle for
            System.out.println("País: " + elemento);
        }

    }
}