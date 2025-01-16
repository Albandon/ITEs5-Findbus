package org.example;

import org.example.IStrategiaWyszukiwania;
import org.example.Model.Trasa;
import org.example.WyszukiwanieBezPrzesiadki;

public class WyborWyszukania {

	private IStrategiaWyszukiwania strategiaWyszukania;

	/**
	 * 
	 * @param strategia
	 */
	public void setStrategia(IStrategiaWyszukiwania strategia) {
		this.strategiaWyszukania = strategia;
	}

	public WyborWyszukania() {
		this.strategiaWyszukania = new WyszukiwanieBezPrzesiadki();
	}

	/**
	 * 
	 * @param from
	 * @param dokad
	 * @param czas
	 */
	public Trasa Wyszukaj(int from, int dokad, int czas) {
		return strategiaWyszukania.Wyszukaj(from, dokad, czas);
	}
}