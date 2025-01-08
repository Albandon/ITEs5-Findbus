import java.util.Set;

public class PrezenterBilet implements IPrezenterBilet {

	private Set<iBilet> bilety;

	/**
	 * 
	 * @param id
	 */
	public void removeBilet(int id) {
		for (iBilet bilet : bilety) {
			if(bilet.getID()==id) {
				bilety.remove(bilet);
				break;
			}
		}
	}

	/**
	 * 
	 * @param bilet
	 */
	public void addBilet(iBilet bilet) {
		bilety.add(bilet);
	}

	/**
	 * 
	 * @param id
	 */
	public iBilet getBilet(int id) {
		for (iBilet bilet : bilety) {
			if (bilet.getID()==id) {
				return bilet;
			}
		}
		return null;
		//TODO - Nie Null
	}

	/**
	 * 
	 * @param czas
	 * @param id
	 * @param cena
	 * @param znizka
	 */
	public iBilet createBilet(int czas, int id, float cena, float znizka) {
		// TODO - implement PrezenterBilet.createBilet
		throw new UnsupportedOperationException();
	}

	public PrezenterBilet() {
		// TODO - implement PrezenterBilet.PrezenterBilet
		throw new UnsupportedOperationException();
	}

}