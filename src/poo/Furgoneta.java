package poo;
// Con extends indicamos que la clase furgoneta tiene que heredar de la clase Coche
        
public class Furgoneta extends Coche {

    private int plazas_extra;
    private int capacidad_carga;


    public Furgoneta(int plazas_extra, int capacidad_carga){
        super(); // Con super se llama al constructor de la clase padre con el objetivo de darle un estado inicial.
        this.plazas_extra=plazas_extra;
        this.capacidad_carga=capacidad_carga;
    }


    public String dimeDatosFurgoneta(){
        return "La capacidad de carga es: " + capacidad_carga + " y las plazas son: " + plazas_extra;
    }

}

