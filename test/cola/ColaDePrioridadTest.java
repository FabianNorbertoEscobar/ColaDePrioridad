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
	
	@Test
	public void tamañoMaximo() {
		Assert.assertEquals(10, this.cola.getTamañoMaximo());
	}
	
	@Test
	public void cantidadDeElementos() {
		Assert.assertEquals(0, this.cola.getCantidadDeElementos());
	}
	
	@Test
	public void queInserta() {
		this.cola.insertar(5);
		Assert.assertEquals(1, this.cola.getCantidadDeElementos());
	}
	
	@Test
	public void queElimina() {
		this.cola.insertar(5);
		Assert.assertEquals(5, this.cola.eliminar());
		Assert.assertEquals(0, this.cola.getCantidadDeElementos());
	}
	
	@Test
	public void quePispea() {
		this.cola.insertar(5);
		Assert.assertEquals(5, this.cola.pispear());
		Assert.assertEquals(1, this.cola.getCantidadDeElementos());
	}
	
}
