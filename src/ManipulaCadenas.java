public class ManipulaCadenas {
    public static void main(String[] args) {
        String nombre="Jorge";
        

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");
        System.out.println("La primera letra de mi nombre es una " + nombre.charAt(0));
        System.out.println("La última letra de mi nombre es " + nombre.charAt(nombre.length()-1));

        String frase="Hoy es un estupendo día para aprender a programar en Java";
        String frase_resumen=frase.substring(1, 3);
        String frase_resumen2=frase.substring(29);
        String frase_resumen3=frase.substring(0, 28) + " irnos a la playa y olvidarnos de todo..." + " y " + frase.substring(30, 57);

        System.out.println(frase_resumen);
        System.out.println(frase_resumen2);
        System.out.println(frase_resumen3);




        
    }
}
