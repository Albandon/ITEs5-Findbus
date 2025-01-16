package org.example;

import org.example.Model.Przystanek;
import org.example.Model.Trasa;

public interface IInterakcjaZUzytkownikiem {

	/**
	 * 
	 * @param przystanek
	 */
	void addToUlubione(Przystanek przystanek);

	Trasa searchTrasa();

	/**
	 * 
	 * @param id
	 */
	void removeFromUlubione(int id);

	String getInformacjeBiletu();

	int getInformacjePrzystanku();

	/**
	 * 
	 * @param czas
	 * @param metodaTransakcji
	 * @param cena
	 */
	void purchaseBilet(int czas, String metodaTransakcji, float cena);

}