package org.example;

import org.example.Model.IPrezenterTras;
import org.example.Model.Trasa;

public class WyszukiwanieZMozliwosciaPrzesiadki implements IStrategiaWyszukiwania {

	/**
	 * 
	 * @param from
	 * @param dokad
	 * @param czas
	 */
	@Override
	public Trasa Wyszukaj(int from, int dokad, int czas, IPrezenterTras prezenter) {
		System.out.println("Wyszukiwanie z możliwością przesiadki");
		prezenter.createTrasa(null,null);
		return prezenter.getTrasa();
	}

}