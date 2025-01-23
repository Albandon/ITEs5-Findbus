package org.example;

import org.example.Model.IPrezenterTras;
import org.example.Model.Trasa;
import org.example.Presenter.PrezenterTras;

public interface IStrategiaWyszukiwania {

	/**
	 * 
	 * @param from
	 * @param dokad
	 * @param czas
	 */
	Trasa Wyszukaj(int from, int dokad, int czas, IPrezenterTras prezenter);

}