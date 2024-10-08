/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
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
}