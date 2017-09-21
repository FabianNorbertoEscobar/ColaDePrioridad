package cola;

import monticulo.Monticulo;
import monticulo.MonticuloMinimo;

public class ColaDePrioridad {

	private Monticulo monticulo;
	private int tama�oMaximo;
	private int cantidadDeElementos;

	public int getTama�oMaximo() {
		return tama�oMaximo;
	}

	public int getCantidadDeElementos() {
		return cantidadDeElementos;
	}

	public ColaDePrioridad(int tama�oMaximo) {
		this.tama�oMaximo = tama�oMaximo;
		this.monticulo = new MonticuloMinimo(tama�oMaximo);
		this.cantidadDeElementos = 0;
	}

	public boolean estaVacia() {
		return this.monticulo.estaVacio();
	}

	public boolean estaLlena() {
		return this.estaLlena();
	}

	public void insertar(int nuevo) throws IllegalStateException {
		if (this.monticulo.estaLleno()) {
			throw new IllegalStateException("No se puede insertar. Cola de prioridad llena.");
		}
		this.cantidadDeElementos++;
		this.insertar(nuevo);
	}

	public int eliminar() throws IllegalStateException {
		if (this.monticulo.estaVacio()) {
			throw new IllegalStateException("No se puede eliminar. Cola de prioridad vac�a.");
		}
		this.cantidadDeElementos--;
		return this.eliminar();
	}

	public int pispear() {
		if (this.monticulo.estaVacio()) {
			throw new IllegalStateException("No se puede pispear. Cola de prioridad vac�a.");
		}
		return this.pispear();
	}
}
