package org.example.Model;
import java.util.HashSet;
import java.util.Set;

public class Ulubione {

	private Set<Integer> przystanki;

	public Ulubione() {
		przystanki = new HashSet<Integer>();
	}
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
	public boolean removePrzystanek(int Id) {
		if (!przystanki.contains(Id)) return false;
		przystanki.remove(Id);
		return true;
	}

	public Set<Integer> getPrzystanki() {
		return this.przystanki;
	}

}