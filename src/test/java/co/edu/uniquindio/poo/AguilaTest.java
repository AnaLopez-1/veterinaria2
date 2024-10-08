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
public class AguilaTest {
    private static final Logger LOG = Logger.getLogger(AguilaTest.class.getName());

    /**
     * Rigorous Test :-)
     */

@Test
    public void testAguila() {
        LOG.info("Iniciando test Aguila");

        Veterinario veterinario3=new Veterinario("Michelle", "Díaz", "LuisP@gmail.com","12346","129797","Aves");

        AnimalSalvaje aguila = new AnimalSalvaje("Condor", 2, "25 kg", "Monte Everest", true, veterinario3);
        assertEquals("Condor", aguila.getNombre());
        assertEquals(2, aguila.getEdad());
        assertEquals("25 kg", aguila.getPeso()); 
        assertEquals("Monte Everest", aguila.getHabitadNatural());
        assertEquals(veterinario3, aguila.getVeterinario());

        LOG.info("Iniciando test Aguila");

    }
}
