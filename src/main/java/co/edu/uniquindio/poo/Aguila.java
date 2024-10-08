package co.edu.uniquindio.poo;

public class Aguila extends AnimalSalvaje{
    private float envergadurasAlas;

    public Aguila(String nombre, int edad, String peso, String habitadNatural, boolean comportamientoInstitivo, Veterinario veterinario, float envergadurasAlas){
        super(nombre, edad, peso, habitadNatural, comportamientoInstitivo, veterinario);
        this.envergadurasAlas=envergadurasAlas;
    }

    public float getEnvergadurasAlas() {
        return envergadurasAlas;
    }

    public void setEnvergadurasAlas(float envergadurasAlas) {
        this.envergadurasAlas = envergadurasAlas;
    }

    public void comer(){
        System.out.println(getNombre()+  " está comiendo.");
    }

    public void dormir(){
        System.out.println(getNombre()+  " está durmiendo.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Envergaduras Alas: " + getEnvergadurasAlas();
    }
}
