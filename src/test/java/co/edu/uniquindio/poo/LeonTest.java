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
public class LeonTest {
    private static final Logger LOG = Logger.getLogger(LeonTest.class.getName());

    /**
     * Rigorous Test :-)
     */

@Test
    public void testLeon() {
        LOG.info("Iniciando test Leon");


        Veterinario veterinario2 = new Veterinario("María", "Hincapie", "MahiP@gmail.com","12345","12979","Felino");

        AnimalSalvaje leon = new AnimalSalvaje("Rey León", 6, "50 kg", "Selva Guayu", true, veterinario2);
        assertEquals("Rey León", leon.getNombre());
        assertEquals(6, leon.getEdad());
        assertEquals("50 kg", leon.getPeso()); 
        assertEquals("Selva Guayu", leon.getHabitadNatural()); 
        assertEquals(veterinario2, leon.getVeterinario());

        LOG.info("Finalizando test Leon");
    }
}
