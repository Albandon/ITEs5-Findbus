package org.example.Model;
public class Trasa {

	private int[] czas;
	private Przystanek[] przystanki;

	/**
	 * 
	 * @param przystanki
	 * @param czas
	 */
	public Trasa(Przystanek[] przystanki, int[] czas) {
		this.przystanki = przystanki;
		this.czas = czas;
	}

	/**
	 * 
	 * @param przystanek
	 */
	public Przystanek[] getPrzystanki () {
		return this.przystanki;
	}

	/**
	 * 
	 * @param przystanek
	 */
	public void addPrzystanek(Przystanek przystanek) {
		// TODO - implement Trasa.addPrzystanek
		throw new UnsupportedOperationException();
	}

	public int getCzas() {
		return this.czas[this.czas.length-1] - this.czas[0];
	}

	/**
	 * 
	 * @param czas
	 */
	public void setCzas(int czas) {
		// TODO - implement Trasa.setCzas
		throw new UnsupportedOperationException();
	}

}