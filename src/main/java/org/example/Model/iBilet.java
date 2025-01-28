package org.example.Model;
public interface iBilet {

	/**
	 * 
	 * @param czas
	 */
	void setCzas(int czas);

	int getCzas();

	int getID();

	float getCena();

	int getZnizka();
	@Override
	boolean equals(Object obj);
	@Override
	int hashCode();
}