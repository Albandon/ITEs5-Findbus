package org.example.Model;
public interface IPrezenterUlubione {

	/**
	 * 
	 * @param id
	 */
	void addToUlubione(int id);

	/**
	 * 
	 * @param id
	 */
	void removeFromUlubione(int id);

	Ulubione getUlubione();

}