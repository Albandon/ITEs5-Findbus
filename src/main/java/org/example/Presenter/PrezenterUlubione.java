package org.example.Presenter;

import org.example.Model.IPrezenterUlubione;
import org.example.Model.Przystanek;
import org.example.Model.Ulubione;

public class PrezenterUlubione implements IPrezenterUlubione {

	private Ulubione ulubione;

	/**
	 * 
	 * @param id
	 */
	public void addToUlubione(int id) {

		ulubione.addPrzystanek(id);
	}

	/**
	 * 
	 * @param id
	 */
	public void removeFromUlubione(int id) {
		var res = ulubione.removePrzystanek(id);

		if (!res) throw new IllegalArgumentException("Operacja się nie powiodła");


	}

	public Ulubione getUlubione() {
		var res = ulubione;
		if (ulubione == null) {
			throw new NullPointerException("Lista ulubione jest pusta");
		}
		return res;
	}

	public PrezenterUlubione() {
		
	}

}