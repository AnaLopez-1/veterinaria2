package co.edu.uniquindio.poo;

public class Veterinaria {
    private String nombre;
    private String direccion;


    public Veterinaria(String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        assert!nombre.isBlank();
        assert!direccion.isBlank();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Veterinaria \n\n" +
                "Nombre:" + nombre + "\n" +
                "Direccion:" + direccion + "\n";
    }
}
