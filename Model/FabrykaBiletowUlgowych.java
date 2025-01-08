public class FabrykaBiletowUlgowych extends FabrykaBiletow {

	/**
	 * 
	 * @param czas
	 * @param id
	 * @param cena
	 * @param znizka
	 */
	public iBilet createBilet(int czas, int id, float cena, int znizka) {
		return new BiletUlgowy(czas, id, cena, znizka);
	}

	public FabrykaBiletowUlgowych() {
		// TODO - implement FabrykaBiletowUlgowych.FabrykaBiletowUlgowych
		throw new UnsupportedOperationException();
	}

}