/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CanarioTest {
    private static final Logger LOG = Logger.getLogger(CanarioTest.class.getName());

    /**
     * Rigorous Test :-)
     */

@Test
    public void testCanario() {
        LOG.info("Iniciando test Canario");

 
        Dueño dueño2=new Dueño("Lorena", "Oviedo", "Lore2@gmail.com", "3153435", "1234");
        Veterinario veterinario3=new Veterinario("Michelle", "Díaz", "LuisP@gmail.com","12346","129797","Aves");
 
        AnimalDomestico canario = new AnimalDomestico("Pepe", 2, "1 kg", dueño2, false, veterinario3);
        assertEquals("Pepe", canario.getNombre());
        assertEquals(2, canario.getEdad());
        assertEquals("1 kg", canario.getPeso()); 
        assertEquals(dueño2, canario.getDueño());
        assertEquals(veterinario3, canario.getVeterinario());

        LOG.info("Iniciando test Canario");

    }
 }
