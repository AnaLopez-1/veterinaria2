package co.edu.uniquindio.poo;

public class Perro extends AnimalDomestico{
    private String raza;

    public Perro(String nombre, int edad, String peso, Dueño dueño3, boolean requiereCuidadoEspecial, Veterinario veterinario, String raza){
        super(nombre, edad, peso, dueño3, requiereCuidadoEspecial, veterinario);
        this.raza=raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void comer(){
        System.out.println(getNombre() + " está comiendo.");
    }

    public void dormir(){
        System.out.println(getNombre() + " está durmiendo.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Raza: " + raza;
    }
}
