package cola;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColaDePrioridadTest {

	private ColaDePrioridad cola;
	
	@Before
	public void queSeInstancia() {
		cola = new ColaDePrioridad(10);
	}
	
	@Test
	public void estaLlena() {
		Assert.assertFalse(this.cola.estaLlena());
	}
	
	@Test
	public void estaVacio() {
		Assert.assertTrue(this.cola.estaVacia());
	}
}
