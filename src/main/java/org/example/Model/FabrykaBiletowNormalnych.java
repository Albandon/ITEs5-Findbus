public class FabrykaBiletowNormalnych extends FabrykaBiletow {

	/**
	 * 
	 * @param czas
	 * @param id
	 * @param cena
	 * @param znizka
	 */
	@Override
	public iBilet createBilet(int czas, int id, float cena, int znizka) {
		return new BiletNormalny(czas,id,cena);
	}
}