package org.example;

import org.example.Model.IPrezenterTras;
import org.example.Model.Trasa;

public class WyszukiwanieBezPrzesiadki implements IStrategiaWyszukiwania {

	/**
	 * 
	 * @param from
	 * @param dokad
	 * @param czas
	 */
	@Override
	public Trasa Wyszukaj(int from, int dokad, int czas, IPrezenterTras prezenter) {
		System.out.println("Wyszukiwanie trasy bez przesiadki");
		//logika oraz komunikacja z api zewnętrznej DB
		prezenter.createTrasa(null,null);
		return prezenter.getTrasa();
	}

}