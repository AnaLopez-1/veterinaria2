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
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVacios() {
        LOG.info("Iniciando test datosVacios");

        assertThrows(Throwable.class, ()->new Veterinaria(" ", " "));

        LOG.info("Finalizando test datosVacios");
    }

    
    @Test
    public void revisarGetYSet() {
        LOG.info("Iniciando test revisarGetYSet");
        Veterinaria veterinaria = new Veterinaria("Clinica Animal", "Calle 123");
        
        assertEquals("Clinica Animal", veterinaria.getNombre());
        assertEquals("Calle 123", veterinaria.getDireccion());
        
        veterinaria.setNombre("Nueva Clinica");
        assertEquals("Nueva Clinica", veterinaria.getNombre());
        
        veterinaria.setDireccion("Calle 456");
        assertEquals("Calle 456", veterinaria.getDireccion());
        LOG.info("Finalizando test revisarGetYSet");
    }
}


