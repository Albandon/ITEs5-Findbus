package org.example.Model;

import java.util.concurrent.atomic.AtomicInteger;

public interface iBilet {
	public static final AtomicInteger count = new AtomicInteger(0);

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
	@Override
	String toString();
}