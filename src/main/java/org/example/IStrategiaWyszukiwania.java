package org.example;

import org.example.Model.Trasa;

public interface IStrategiaWyszukiwania {

	/**
	 * 
	 * @param from
	 * @param dokad
	 * @param czas
	 */
	Trasa Wyszukaj(int from, int dokad, int czas);

}