package org.example.Model;

public abstract class FabrykaBiletow {

	/**
	 * 
	 * @param czas
	 * @param id
	 * @param cena
	 * @param znizka
	 */
	public abstract iBilet createBilet(int czas, int id, float cena, int znizka);
}