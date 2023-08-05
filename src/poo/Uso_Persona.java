package poo;
import java.util.*;


public class Uso_Persona {
    public static void main(String[] args){

        Persona[] lasPersonas=new Persona[3];
        lasPersonas[0]=new Empleado2("Luis Conde", 50000, 2009, 02, 25);
        lasPersonas[1]=new Alumno("Ana López", "Biológicas");
        lasPersonas[2]=new Empleado2("Mari Carmen", 80000, 2007, 03, 22);

        for (Persona p:lasPersonas){
            System.out.println(p.dameNombre() + " , " + p.dameDescripcion());
        }

    }
}

abstract class Persona{
    public Persona(String nom){
        nombre=nom;
    }

    public String dameNombre(){
        return nombre;
    }

    public abstract String dameDescripcion(); // Cuando declaramos un metodo como abstracto, estamos obligados a declarar la clase como abstracta también

    private String nombre;


}


class Empleado2 extends Persona{
    public Empleado2(String nom, double sue, int agno, int mes, int dia){
        super(nom);
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
        altaContrato=calendario.getTime();
        Id=IdSiguiente;
        IdSiguiente++;

    }

    public String dameDescripcion(){
        return "Este empleado tiene el Id " + Id + " con un sueldo de " + sueldo + " y la fecha de alta del contrato es: " + altaContrato;
    }

    

    public double dameSueldo(){ // GETTER
        return sueldo;
    }

    public Date dameFechaContrato(){ // GETTER
        return altaContrato;
    }

    public void subeSueldo(double porcentaje){ //SETTER
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }

    public int dameId(){
        return Id;
    }

    private double sueldo;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente=1;
}


class Alumno extends Persona{
    public Alumno(String nom, String car){
        super(nom);
        carrera=car;
    }

    public String dameDescripcion(){
        return "El alumno esta estudiando la carrera de " + carrera;
    }

    private String carrera;
}

