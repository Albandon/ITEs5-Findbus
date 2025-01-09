public class FunkcjeAplikacji implements IInterakcjaZUzytkownikiem {

	public Trasa searchTrasa() {
		// TODO - implement FunkcjeAplikacji.searchTrasa
		throw new UnsupportedOperationException();
	}

	public String getInformacjeBiletu() {
		// TODO - implement FunkcjeAplikacji.getInformacjeBiletu
		throw new UnsupportedOperationException();
	}

	public void printTrasa() {
		// TODO - implement FunkcjeAplikacji.printTrasa
		throw new UnsupportedOperationException();
	}

	public void printBilet() {
		// TODO - implement FunkcjeAplikacji.printBilet
		throw new UnsupportedOperationException();
	}

	public void printPrzystanek() {
		// TODO - implement FunkcjeAplikacji.printPrzystanek
		throw new UnsupportedOperationException();
	}

	public static void main(String[] args) {
		FabrykaBiletow fabrykaBiletow;
		fabrykaBiletow = new FabrykaBiletowNormalnych();
		fabrykaBiletow.createBilet(0, 0, 0, 0);

		fabrykaBiletow = new FabrykaBiletowUlgowych();
		fabrykaBiletow.createBilet(0, 0, 0, 0);

	}

	public void printInformacjeTransakcji() {
		// TODO - implement FunkcjeAplikacji.printInformacjeTransakcji
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param czas
	 * @param metodaTransakcji
	 * @param cena
	 */
	public void purchaseBilet(int czas, String metodaTransakcji, float cena) {
		// TODO - implement FunkcjeAplikacji.purchaseBilet
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param przystanek
	 */
	public void addToUlubione(Przystanek przystanek) {
		// TODO - implement FunkcjeAplikacji.addToUlubione
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void removeFromUlubione(int id) {
		// TODO - implement FunkcjeAplikacji.removeFromUlubione
		throw new UnsupportedOperationException();
	}

	public int getInformacjePrzystanku() {
		// TODO - implement FunkcjeAplikacji.getInformacjePrzystanku
		throw new UnsupportedOperationException();
	}

}