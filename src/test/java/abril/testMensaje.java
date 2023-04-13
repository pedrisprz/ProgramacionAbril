package abril;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Interfaces.Mensaje;

public class testMensaje {
	@Test
	void testLeerMensaje() {
		Mensaje mensaje1 = new Mensaje("Prueba de mensaje con prioridades");
		
		assertTrue(mensaje1.mensaje.equals("Prueba de mensaje con prioridades"));
		assertTrue(mensaje1.prioridad.equals("normal"));
		
		mensaje1.cambiarPrioridadAlta();
				assertTrue(mensaje1.prioridad.equals("alta"));
				
		mensaje1.cambiarPrioridadBaja();
				assertTrue(mensaje1.prioridad.equals("baja"));
				
	}
}
