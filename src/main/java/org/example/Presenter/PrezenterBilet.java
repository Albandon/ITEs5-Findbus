package org.example.Presenter;

import org.example.Model.*;

import java.util.Set;
import java.util.HashSet;

public class PrezenterBilet implements IPrezenterBilet {

	private Set<iBilet> bilety;

	public PrezenterBilet() {
		this.bilety = new HashSet<>();  // Initialize the Set here
	}

	/**
	 * 
	 * @param id
	 */
	public boolean removeBilet(int id) {
		for (iBilet bilet : bilety) {
			if(bilet.getID()==id) {
				bilety.remove(bilet);
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param bilet
	 */
	public void addBilet(iBilet bilet) {
		bilety.add(bilet);
	}

	/**
	 * 
	 * @param id
	 */
	public iBilet getBilet(int id) {
		for (iBilet bilet : bilety) {
			if (bilet.getID()==id) {
				return bilet;
			}
		}
		return null;
		//TODO - Nie Null
	}
	public iBilet[] getBilety() {
        return bilety.toArray(new iBilet[0]);
    }
	/**
	 * 
	 * @param czas
	 * @param id
	 * @param cena
	 * @param znizka
	 */
	public iBilet createBilet(int czas, int id, float cena, int znizka) throws IllegalArgumentException{
		if (znizka >= 100) throw new IllegalArgumentException("Zniżka nie może przekraczać 100%");
		if (znizka <0) throw new IllegalArgumentException("Zniżka nie może być ujemna");
		FabrykaBiletow fabrykaBiletow = new FabrykaBiletowUlgowych();
		if (znizka == 0) fabrykaBiletow = new FabrykaBiletowNormalnych();
		return fabrykaBiletow.createBilet(czas, id, cena, znizka);
	}

}