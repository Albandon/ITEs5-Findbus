public class PrezenterUlubione implements IPrezenterUlubione {

	private Ulubione ulubione;

	/**
	 * 
	 * @param przystanek
	 */
	public void addToUlubione(Przystanek przystanek) {
		ulubione.addPrzystanek(przystanek.getID());
	}

	/**
	 * 
	 * @param id
	 */
	public void removeFromUlubione(int id) {
		ulubione.removePrzystanek(id);
	}

	public Ulubione getUlubione() {
		return this.ulubione;
	}

	public PrezenterUlubione() {
		
	}

}