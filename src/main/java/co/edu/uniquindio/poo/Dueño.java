package co.edu.uniquindio.poo;

public class Dueño extends Persona{
    private String cedula;

    public Dueño(String nombre, String apellido, String correo, String telefono, String cedula){
        super(nombre, apellido, correo, telefono);
        this.cedula=cedula;
        assert!nombre.isBlank();
        assert!apellido.isBlank();
        assert correo.contains("@");
        assert!telefono.isBlank();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "\n\n" +
               "Nombre: " +getNombre() + "\n" +
               "Apellido: " +getApellido() + "\n" +
               "Correo: " +getCorreo() + "\n" +
               "Telefono: " +getTelefono() + "\n" +
               "Cedula: " + getCedula();
    }
}
