package org.example.Model;
public class Przystanek {

	private int Id;
	private String nazwa;
	private double[] lokalizacja;

	public String getNazwa() {
		return this.nazwa;
	}

	public int getID() {
		return this.Id;
	}

	public double[] getLokalizacja() {
		return this.lokalizacja;
	}

	public String toString() {
		// TODO - implement Przystanek.toString
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param nazwa
	 * @param lokalizacja
	 */
	public Przystanek(int id, String nazwa, double[] lokalizacja) {
		this.Id = id;
		this.nazwa = nazwa;
		this.lokalizacja = lokalizacja;
	}
}