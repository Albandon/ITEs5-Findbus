package org.example.Presenter;

import org.example.Model.IPrezenterPrzystanek;
import org.example.Model.Przystanek;

import java.util.HashSet;
import java.util.Set;

public class PrezenterPrzystanek implements IPrezenterPrzystanek {

	private Set<Przystanek> przystanki;
	private Przystanek przystanek;

	public PrezenterPrzystanek() {
		this.przystanki = new HashSet<>();  // Initialize the Set here
	}
	/**
	 * 
	 * @param id
	 */
	public Przystanek getPrzystanek(int id) {
		return this.przystanek;
	}

	/**
	 * 
	 * @param id
	 */
	public void removePrzystanek(int id) {
		// TODO - baza danych
	}

	/**
	 * 
	 * @param przystanek
	 */
	public void addPrzystanek(Przystanek przystanek) {

		// TODO - baza danych
	}

	/**
	 *
	 * @param przystanek
	 */
	public Przystanek findPrzystanek(String przystanek) {
		// TODO - implement PrezenterPrzystanek.findPrzystanek
		throw new UnsupportedOperationException();
	}



}