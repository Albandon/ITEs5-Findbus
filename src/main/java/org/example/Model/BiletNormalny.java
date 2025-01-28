package org.example.Model;

public class BiletNormalny implements iBilet {

	private int czas;
	private int id;
	private float cena;

    /**
	 * 
	 * @param czas
	 * @param id
	 * @param cena
	 */
	public BiletNormalny(int czas, int id, float cena) {
		this.czas = czas;
		this.id = id;
		this.cena = cena;
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

	public float getCena() {
		return this.cena;
	}

	public int getZnizka() {
		return 0;
	}
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof iBilet)) {
			return false;
		}
		BiletNormalny p = (BiletNormalny)o;
		return this.id == p.id;
	}
	@Override
	public int hashCode(){
		return this.id;
	}

}