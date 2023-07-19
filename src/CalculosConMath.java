public class CalculosConMath {
    public static void main(String[] args){
        //double raiz=Math.sqrt(9);
        double num1=5.85;
        int resultado=(int)Math.round(num1); // Con el (int) realizamos una refundicion que consiste en cambiar a int el resultado que nos devuelve.

        double base=5;
        double exponente=3;
        int resultado2=(int)Math.pow(base, exponente);

        System.out.println(resultado);
        System.out.println("El resultado de "+ base + " elevado a " + exponente + " es " + resultado2);

    }
    
}
