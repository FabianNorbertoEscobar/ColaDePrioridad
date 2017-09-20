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
	
}
