public class FabrykaBiletowNormalnych extends FabrykaBiletow {

	/**
	 * 
	 * @param czas
	 * @param id
	 * @param cena
	 * @param znizka
	 */
	public iBilet createBilet(int czas, int id, float cena, float znizka) {
		return new BiletNormalny(czas,id,cena);
	}

	public FabrykaBiletowNormalnych() {
		// TODO - implement FabrykaBiletowNormalnych.FabrykaBiletowNormalnych
		throw new UnsupportedOperationException();
	}

}