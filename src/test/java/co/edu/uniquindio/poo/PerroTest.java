/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class PerroTest {
    private static final Logger LOG = Logger.getLogger(PerroTest.class.getName());

    /**
     * Rigorous Test :-)
     */

@Test
    public void testPerro() {
        LOG.info("Iniciando test Perro");

        Veterinario veterinario=new Veterinario("Luis", "Perez", "LuisP@gmail.com","1234","129792","Canino");
        Dueño dueño3=new Dueño("Dora", "Bedoya", "DB_@gmail.com", "315343509", "12345");
    
        AnimalDomestico perro = new AnimalDomestico("Tony", 2, "5 kg", dueño3, false, veterinario);
        assertEquals("Tony", perro.getNombre());
        assertEquals(2, perro.getEdad());
        assertEquals("5 kg", perro.getPeso()); 
        assertEquals(dueño3, perro.getDueño());
        assertEquals(veterinario, perro.getVeterinario());

        LOG.info("Finalizando test Perro");
    }
}
