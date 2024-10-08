package co.edu.uniquindio.poo;

public class Gato extends AnimalDomestico{
    private String colorPelaje;

    public Gato(String nombre, int edad, String peso, Dueño dueño, boolean requiereCuidadoEspecial, Veterinario veterinario2, String colorPelaje){
        super(nombre, edad, peso, dueño, requiereCuidadoEspecial, veterinario2);
        this.colorPelaje=colorPelaje;
    }

    public void comer(){
        System.out.println(getNombre()+ " está comiendo.");
    }

    public void dormir(){
        System.out.println(getNombre()+ " está durmiendo.");
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Color Pelaje: " + colorPelaje;
    }
}
