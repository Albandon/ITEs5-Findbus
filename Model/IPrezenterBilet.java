public interface IPrezenterBilet {

	/**
	 * 
	 * @param id
	 */
	void removeBilet(int id);

	/**
	 * 
	 * @param bilet
	 */
	void addBilet(iBilet bilet);

	/**
	 * 
	 * @param id
	 */
	iBilet getBilet(int id);

	/**
	 * 
	 * @param czas
	 * @param id
	 * @param cena
	 * @param znizka
	 */
	iBilet createBilet(int czas, int id, float cena, int znizka);

}