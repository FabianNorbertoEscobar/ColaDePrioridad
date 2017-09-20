package cola;

import monticulo.Monticulo;
import monticulo.MonticuloMinimo;

public class ColaDePrioridad {

	private Monticulo monticulo;
	private int tamañoMaximo;
	private int cantidadDeElementos;

	public int getTamañoMaximo() {
		return tamañoMaximo;
	}

	public int getCantidadDeElementos() {
		return cantidadDeElementos;
	}

	public ColaDePrioridad(int tamañoMaximo) {
		this.tamañoMaximo = tamañoMaximo;
		this.monticulo = new MonticuloMinimo(tamañoMaximo);
		this.cantidadDeElementos = 0;
	}

	public boolean estaVacia() {
		return this.monticulo.estaVacio();
	}

	public boolean estaLlena() {
		return this.estaLlena();
	}
	
}
