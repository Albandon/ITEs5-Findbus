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
		ulubione.removePrzystanek(id);
	}

	public Ulubione getUlubione() {
		return this.ulubione;
	}

	public PrezenterUlubione() {
		
	}

}