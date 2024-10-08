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
public class GatoTest {
    private static final Logger LOG = Logger.getLogger(GatoTest.class.getName());

    /**
     * Rigorous Test :-)
     */

@Test
    public void testGato() {
        LOG.info("Iniciando test Gato");

        Dueño dueño1 = new Dueño("Luis", "Salazar", "Luis2@gmail.com", "315343553", "123"); 
        Veterinario veterinario2 = new Veterinario("María", "Hincapie", "MahiP@gmail.com","12345","12979","Felino");

        AnimalDomestico gato = new AnimalDomestico("Lulu", 2, "3 kg", dueño1, true, veterinario2);
        assertEquals("Lulu", gato.getNombre());
        assertEquals(2, gato.getEdad());
        assertEquals("3 kg", gato.getPeso()); 
        assertEquals(dueño1, gato.getDueño());
        assertEquals(veterinario2, gato.getVeterinario());

        LOG.info("Finalizando test Gato");

    }
}
