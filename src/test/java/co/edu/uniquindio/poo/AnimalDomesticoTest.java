/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AnimalDomesticoTest {
    private static final Logger LOG = Logger.getLogger(AnimalDomesticoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
@Test
    public void RequiereCuidadoEspecial() {
        AnimalDomestico animal = new AnimalDomestico("Fido", 3, "10kg", null, true, null);
        animal.setRequiereCuidadoEspecial(false);
        assertEquals(false, animal.isRequiereCuidadoEspecial());
    LOG.info("Finalizando test requiereCuidadoEspecial");

    }

    @Test
    public void Dueño() {
        AnimalDomestico animal = new AnimalDomestico("Fido", 3, "10kg", null, true, null);
        assertEquals(null, animal.getDueño());
    LOG.info("Finalizando test dueño");

    }

}
