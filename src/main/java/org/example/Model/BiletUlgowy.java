package org.example.Model;

public class BiletUlgowy implements iBilet {

	private int czas;
	private int id;
	private float cena;
	private int znizka;

	/**
	 * 
	 * @param czas
	 * @param id
	 * @param cena
	 * @param znizka
	 */
	public BiletUlgowy(int czas, int id, float cena, int znizka) {
		this.czas=czas;
		this.id = id;
		this.cena = cena;
		this.znizka = znizka;
	}

	/**
	 * 
	 * @param czas
	 */
	public void setCzas(int czas) {
		this.czas = czas;
	}

	public int getCzas() {
		return this.czas;
	}

	public int getID() {
		return this.id;
	}

	public int getZnizka() {
		return this.znizka;
	}

	public float getCena() {
		return this.cena;
	}
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof iBilet)) {
			return false;
		}
		BiletUlgowy p = (BiletUlgowy)o;
		return this.id == p.id;
	}
	@Override
	public int hashCode(){
		return this.id;
	}
}