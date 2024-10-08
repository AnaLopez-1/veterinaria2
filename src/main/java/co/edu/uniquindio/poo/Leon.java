package co.edu.uniquindio.poo;

public class Leon extends AnimalSalvaje{
    private String melena;

    public Leon(String nombre, int edad, String peso, String habitadNatural, boolean comportamientoInstitivo, Veterinario veterinario, String melena){
        super(nombre, edad, peso, habitadNatural, comportamientoInstitivo, veterinario);
        this.melena=melena;
    }

    public void comer(){
        System.out.println(getNombre()+ " está comiendo.");
    }

    public void dormir(){
        System.out.println(getNombre()+ " está durmiendo.");
    }

    public String getMelena() {
        return melena;
    }

    public void setMelena(String melena) {
        this.melena = melena;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Melena: " + melena;
    }
}
