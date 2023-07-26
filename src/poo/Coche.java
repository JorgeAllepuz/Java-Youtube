package poo;

public class Coche {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    public Coche(){ //Asi se declara el metodo constructor, debe llamarse igual que la clase
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
    }

    public String dime_datos_generales(){ // Metodo GETTER, siempre devuelve algo con return (obligatorio)
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + ". Mide " + largo/1000 + " metros de largo y " + (double) ancho/1000 + " metros de ancho" +
        " La plataforma o chasis, tiene un peso de " + peso_plataforma + " kilos y monta un motor de " + motor + " centimetros cúbicos";
    }

    public void establece_color(String color_coche){ // Metodo SETTER, siempre con void indicando que no devuelve nada
        color=color_coche;
    }

    public String dime_color(){
        return "El color del coche es " + color;
    }

    public void configura_asientos(String asientos_cuero){ //SETTER
        if (asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero=true; // Con this nos referimos a la variable y no al argumento cuando se llaman igual
        }else{
            this.asientos_cuero=false;
        }
    }

    public String dime_asientos(){ // GETTER
        if(asientos_cuero==true){
            return ("El coche tiene asientos de cuero");
        }else{
            return ("El coche tiene asientos de serie");
        }
    }

    public void configura_climatizador(String climatizador){ // SETTER
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }

    public String dime_climatizador(){ //GETTER
        if(climatizador==true){
            return "El coche incorpora climatizador";
        }else{
            return "El coche no incorpora climatizador";
        }
    }

    public String dime_peso_coche(){ // SETTER & GETTER AT THE SAME TIME
        int peso_carroceria=500;
        peso_total=peso_plataforma+peso_carroceria;

        if(asientos_cuero==true){
            peso_total=peso_total+50;
        }
        if(climatizador==true){
            peso_total=peso_total+20;
        }
        return "El peso del coche es de " + peso_total + " kilos";
    }

    public int dime_precio_coche(){ // GETTER
        int precio_final=10000;
        if(asientos_cuero==true){
            precio_final+=2000;
        }
        if(climatizador==true){
            precio_final+=1500;
        }
        return precio_final;
    }
}
