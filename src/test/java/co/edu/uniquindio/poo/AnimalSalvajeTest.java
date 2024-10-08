/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AnimalSalvajeTest {
    private static final Logger LOG = Logger.getLogger(AnimalSalvajeTest.class.getName());

    /**
     * Rigorous Test :-)
     */
@Test
    public void comportamientoInstintivo() {
        LOG.info("Iniciando test comportamientoInstintivo");

        AnimalSalvaje animal = new AnimalSalvaje("Rey Leon", 6, "50 kg", "Selva Guayu", false, null);
        animal.setComportamientoInstintivo(true);
        assertEquals(true, animal.isComportamientoInstintivo());

        LOG.info("Finalizando test comportamientoInstintivo");

    }

        @Test
    public void testAccionDelAnimal() {
        AnimalDomestico gato = new AnimalDomestico("Lulu", 2, "3 kg", null, true, null);
        assertDoesNotThrow(() -> gato.comer());
        assertDoesNotThrow(() -> gato.dormir());
    }

}
