package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Veterinaria veterinaria=new Veterinaria("Patitas peludas", "Barrio Granada Carrera 22 Calle 13");
        System.out.println(veterinaria);    
    
        //Crear veterinario
        Veterinario veterinario=new Veterinario("Luis", "Perez", "LuisP@gmail.com","1234","129792","Canino");
        Veterinario veterinario2=new Veterinario("María", "Hincapie", "MahiP@gmail.com","12345","12979","Felino");
        Veterinario veterinario3=new Veterinario("Michelle", "Díaz", "LuisP@gmail.com","12346","129797","Aves");
    
        //Crear dueño
        
        Dueño dueño1=new Dueño("Luis", "Salazar", "Luis2@gmail.com", "315343553", "123");
        Dueño dueño2=new Dueño("Lorena", "Oviedo", "Lore2@gmail.com", "3153435", "1234");
        Dueño dueño3=new Dueño("Dora", "Bedoya", "DB_@gmail.com", "315343509", "12345");
            
    
        //Crear animal Domestico 
    
        AnimalDomestico perro = new AnimalDomestico("Tony", 2, "5 kg", dueño3, false, veterinario);
        AnimalDomestico canario = new AnimalDomestico("Pepe", 2, "1 kg", dueño2, false, veterinario3);
        AnimalDomestico gato = new AnimalDomestico ("Lulu", 2, "3 kg", dueño1, true, veterinario2);
    
        // Imprimir animales domesticos
        System.out.println("Animal domestico \n");
        System.out.println(perro);
        perro.comer();
        perro.dormir();
        System.out.println(); 


        System.out.println("Animal domestico \n");
        System.out.println(gato);
        gato.comer();
        gato.dormir();
        System.out.println(); 

        System.out.println("Animal domestico \n");
        System.out.println(canario);
        canario.comer();
        canario.dormir();
        System.out.println(); 

        //Crear animal Salvaje
        AnimalSalvaje leon = new AnimalSalvaje("Rey León", 6, "50 kg", "Selva Guayu", true, veterinario2);
        AnimalSalvaje aguila = new AnimalSalvaje("Condor", 2, "25 kg", "Monte Everest", true, veterinario3);


        //Imprimir animales salvajes
        System.out.println("Animal salvaje \n");
        System.out.println(leon);
        leon.comer();
        leon.dormir();
        System.out.println();

        System.out.println("Animal salvaje \n");
        System.out.println(aguila);
        aguila.comer();
        aguila.dormir();
        System.out.println();
    }
}