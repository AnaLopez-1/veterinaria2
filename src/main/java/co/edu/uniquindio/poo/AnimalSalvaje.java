package co.edu.uniquindio.poo;

public class AnimalSalvaje extends Animal{
    private String habitadNatural;
    private boolean comportamientoInstintivo;
    private Veterinario veterinario;

    public AnimalSalvaje(String nombre, int edad, String peso, String habitadNatural, boolean comportamientoInstintivo, Veterinario veterinario){
        super(nombre, edad, peso);
        this.habitadNatural=habitadNatural;
        this.comportamientoInstintivo=comportamientoInstintivo;
        this.veterinario=veterinario;
    }

    public String getHabitadNatural() {
        return habitadNatural;
    }

    public void setHabitadNatural(String habitadNatural) {
        this.habitadNatural = habitadNatural;
    }

    public boolean isComportamientoInstintivo() {
        return comportamientoInstintivo;
    }

    public void setComportamientoInstintivo(boolean comportamientoInstintivo) {
        this.comportamientoInstintivo = comportamientoInstintivo;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Habitad Natural: " + habitadNatural + "\n" +
               "Comportamiento Instintivo: " + comportamientoInstintivo + "\n\n" +
               "Veterinario " + getVeterinario() + "\n";
    }
}
