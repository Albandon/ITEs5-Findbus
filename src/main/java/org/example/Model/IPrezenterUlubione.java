public interface IPrezenterUlubione {

	/**
	 * 
	 * @param przystanek
	 */
	void addToUlubione(Przystanek przystanek);

	/**
	 * 
	 * @param id
	 */
	void removeFromUlubione(int id);

	Ulubione getUlubione();

}