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
	public void Bilet(int czas, int id, float cena) {
		// TODO - implement BiletNormalny.Bilet
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
		// TODO - implement BiletNormalny.getID
		throw new UnsupportedOperationException();
	}

	public float getCena() {
		return this.cena;
	}

	public float getZnizka() {
		// TODO - implement BiletNormalny.getZnizka
		throw new UnsupportedOperationException();
	}

}