package poo;
import java.util.*;

public class Uso_Empleado {
    public static void main(String[] args){
        
        /*Empleado empleado1=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        Empleado empleado2=new Empleado("Ana López", 95000, 1995, 06, 02);
        Empleado empleado3=new Empleado("María Martín", 105000, 2002, 03, 15);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() +
        " Fecha de alta: " + empleado1.dameFechaContrato());

        System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() +
        " Fecha de alta: " + empleado2.dameFechaContrato());

        System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() +
        " Fecha de alta: " + empleado3.dameFechaContrato());*/

        Empleado[] misEmpleados=new Empleado[4];
        misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        misEmpleados[1]=new Empleado("Ana López", 95000, 1995, 06, 02);
        misEmpleados[2]=new Empleado("María Martín", 105000, 2002, 03, 15);
        misEmpleados[3]=new Empleado("Antonio Fernández");

        // Bucle tradicional para subir el sueldo 
        /*for (int i=0;i<3;i++){
            misEmpleados[i].subeSueldo(5);
        }*/
        // Bucle mejorado para subir el sueldo
        for (Empleado e:misEmpleados){
            e.subeSueldo(5);
        }
        // Bucle tradicional para recorrer los empleados 
        /*for (int i=0;i<3;i++){
            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha de alta: " + 
            misEmpleados[i].dameFechaContrato());
        }*/
        // Bucle mejorado para recorrer los empleados 
        for (Empleado e:misEmpleados){
            System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de alta: " + 
            e.dameFechaContrato());
        }




    }
}


class Empleado{
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
        altaContrato=calendario.getTime();

    }

    /*Sobrecarga de constructores, se pueden crear varios constructores con el mismo nombre y en la misma clase, 
    pero evitando que reciban el mismo número de argumentos para que no devuelva error*/
    public Empleado(String nom){
        this(nom, 30000, 2000, 01, 01);
    }

    public String dameNombre(){ // GETTER
        return nombre;
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

    private String nombre;
    private double sueldo;
    private Date altaContrato;
}

