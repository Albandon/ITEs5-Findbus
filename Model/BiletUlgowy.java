public class BiletUlgowy implements iBilet {

	private int czas;
	private int id;
	private float cena;
	private float znizka;

	/**
	 * 
	 * @param czas
	 * @param id
	 * @param cena
	 * @param znizka
	 */
	public void Bilet(int czas, int id, float cena, int znizka) {
		// TODO - implement BiletUlgowy.Bilet
		throw new UnsupportedOperationException();
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
		// TODO - implement BiletUlgowy.getID
		throw new UnsupportedOperationException();
	}

	public float getZnizka() {
		return this.znizka;
	}

	public float getCena() {
		return this.cena;
	}

}