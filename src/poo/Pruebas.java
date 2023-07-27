package poo;

public class Pruebas {
    public static void main(String[] args){
        Empleados trabajador1=new Empleados("Jorge");
        Empleados trabajador2=new Empleados("Anca");
        Empleados trabajador3=new Empleados("Antonio");
        Empleados trabajador4=new Empleados("María");

        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos());

        System.out.println(trabajador2.devuelveDatos());

        System.out.println(trabajador3.devuelveDatos());

        System.out.println(trabajador4.devuelveDatos());

        System.out.println(Empleados.dameIdSiguiente());




    }
}

class Empleados{

    public Empleados(String nom){
        nombre=nom;
        seccion="Administración";
        Id=IdSiguiente;
        IdSiguiente++;
    }

    public void cambiaSeccion(String seccion){ // SETTER
        this.seccion=seccion;
    }

    public String devuelveDatos(){ // GETTER
        return "El nombre es: " + nombre + ", el Id es: " + Id + " y la sección es: " + seccion;
    }

    public static String dameIdSiguiente(){
        return "El IdSiguiente es: " + IdSiguiente;
    }


    private final String nombre; // Con final declaramos la variable como constante y no se podra modificar mediante algun metodo.
    private String seccion;
    private int Id;
    private static int IdSiguiente=1;

}
