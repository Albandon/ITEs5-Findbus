public class WyszukiwanieBezPrzesiadki implements IStrategiaWyszukiwania {

	/**
	 * 
	 * @param from
	 * @param dokad
	 * @param czas
	 */
	@Override
	public Trasa Wyszukaj(int from, int dokad, int czas) {
		System.out.println("Wyszukiwanie trasy bez przesiadki");
		return new Trasa(null, null);
	}

}