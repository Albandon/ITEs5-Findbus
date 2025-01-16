package org.example.Model;
import java.util.Set;

public class Ulubione {

	private Set<Integer> przystanki;

	/**
	 * 
	 * @param Id
	 */
	public void addPrzystanek(int Id) {
		przystanki.add(Id);
	}

	/**
	 * 
	 * @param Id
	 */
	public void removePrzystanek(int Id) {
		przystanki.remove(Id);
	}

	public Set<Integer> getPrzystanki() {
		return this.przystanki;
	}

}