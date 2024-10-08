/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class DueñoTest {
    private static final Logger LOG = Logger.getLogger(DueñoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
@Test
    public void datosVacios() {
        LOG.info("Iniciando test datosVacios");

        assertThrows(Throwable.class, ()->new Dueño(" ", " ", " ", " ", ""));

        LOG.info("Finalizando test datosVacios");
    }

@Test
    public void validacionCorreo() {
        LOG.info("Iniciando test validacionCorreo");

        assertThrows(Throwable.class, ()->new Dueño("Luis", "Salazar", "Luis2", "315343553", "123"));

        LOG.info("Finalizando test validacionCorreo");
    }

@Test 
    public void testDueño(){
        LOG.info("Iniciando test Dueño");

        Dueño dueño1 = new Dueño("Luis", "Salazar", "Luis2@gmail.com", "315343553", "123"); 
        assertEquals("Luis",dueño1.getNombre());
        assertEquals("Salazar",dueño1.getApellido());
        assertEquals("Luis2@gmail.com",dueño1.getCorreo());
        assertEquals("315343553",dueño1.getTelefono());
        assertEquals("123",dueño1.getCedula());

        LOG.info("Finalizando test Dueño");
    }
}
