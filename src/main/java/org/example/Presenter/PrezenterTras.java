package org.example.Presenter;

import org.example.Model.IPrezenterTras;
import org.example.Model.Przystanek;
import org.example.Model.Trasa;


public class PrezenterTras implements IPrezenterTras {

	private Trasa trasa;

	public Trasa getTrasa() {
		return this.trasa;
	}

	/**
	 * 
	 * @param trasa
	 */
	public void setTrasa(Trasa trasa) {
		this.trasa = trasa;
	}

	/**
	 * 
	 * @param przystanki
	 * @param czas
	 */
	public void createTrasa(Przystanek[] przystanki, int[] czas) {
		this.trasa = new Trasa(przystanki, czas);
	}

	public PrezenterTras() {
		// TODO - implement PrezenterTras.PrezenterTras
		throw new UnsupportedOperationException();
	}

}