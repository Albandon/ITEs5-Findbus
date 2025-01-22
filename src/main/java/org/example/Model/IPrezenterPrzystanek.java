package org.example.Model;
public interface IPrezenterPrzystanek {

	/**
	 * 
	 * @param id
	 */
	Przystanek getPrzystanek(int id);

	/**
	 * 
	 * @param id
	 */
	boolean removePrzystanek(int id);

	/**
	 * 
	 * @param przystanek
	 */
	void addPrzystanek(Przystanek przystanek);

	/**
	 * 
	 * @param przystanek
	 */
	Przystanek findPrzystanek(String przystanek);

}