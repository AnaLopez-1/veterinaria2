package co.edu.uniquindio.poo;

public class AnimalDomestico extends Animal{
    private Dueño dueño;
    private boolean requiereCuidadoEspecial;
    private Veterinario veterinario;

    public AnimalDomestico(String nombre, int edad, String peso, Dueño dueño, boolean requiereCuidadoEspecial, Veterinario veterinario){
        super(nombre, edad, peso);
        this.dueño=dueño;
        this.requiereCuidadoEspecial=requiereCuidadoEspecial;
        this.veterinario=veterinario;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public boolean isRequiereCuidadoEspecial() {
        return requiereCuidadoEspecial;
    }

    public void setRequiereCuidadoEspecial(boolean requiereCuidadoEspecial) {
        this.requiereCuidadoEspecial = requiereCuidadoEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Requiere cuidado especial: " + requiereCuidadoEspecial + "\n\n" +
               "Dueño " + getDueño() + "\n\n" +
               "Veterinario " + getVeterinario() + "\n";
    }

    public String getRaza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRaza'");
    }
}
