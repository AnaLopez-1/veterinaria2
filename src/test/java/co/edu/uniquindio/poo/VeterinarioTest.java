/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinarioTest {
    private static final Logger LOG = Logger.getLogger(VeterinarioTest.class.getName());

    /**
     * Rigorous Test :-)
     */

    @Test
    public void datosVacios() {
        LOG.info("Iniciando test datosVacios");

        assertThrows(Throwable.class, ()->new Veterinario(" ", " "," "," "," "," "));

        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void validacionCorreo() {
        LOG.info("Iniciando test validacionCorreo");

        assertThrows(Throwable.class, ()->new Veterinario("Luis", "Perez", "LuisP","1234","129792","Canino"));

        LOG.info("Finalizando test validacionCorreo");
    }

    @Test
        public void testVeterianrio() {
            LOG.info("Iniciando test Veterinario");

            Veterinario veterinario2 = new Veterinario("María", "Hincapie", "MahiP@gmail.com","12345","12979","Felino");
            assertEquals("María", veterinario2.getNombre());
            assertEquals("Hincapie", veterinario2.getApellido());
            assertEquals("MahiP@gmail.com", veterinario2.getCorreo()); 
            assertEquals("12345", veterinario2.getTelefono());
            assertEquals("12979", veterinario2.getIdVeterinario());
            assertEquals("Felino", veterinario2.getEspecializacion());

            LOG.info("Finalizando test Veterinario");
    }

}