package org.example.Model;
public interface IPrezenterTras {

	Trasa getTrasa();

	/**
	 * 
	 * @param trasa
	 */
	void setTrasa(Trasa trasa);

	/**
	 * 
	 * @param przystanki
	 * @param czas
	 */
	void createTrasa(Przystanek[] przystanki, int[] czas);

}