public class WyszukiwanieZMozliwosciaPrzesiadki implements IStrategiaWyszukiwania {

	/**
	 * 
	 * @param from
	 * @param dokad
	 * @param czas
	 */
	@Override
	public Trasa Wyszukaj(int from, int dokad, int czas) {
		System.out.println("Wyszukiwanie z możliwością przesiadki");
		return new Trasa(null, null);
	}

}