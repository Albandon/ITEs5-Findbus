package org.example.Presenter;

import org.example.Model.IPrezenterPrzystanek;
import org.example.Model.Przystanek;

import java.util.HashSet;
import java.util.Set;

public class PrezenterPrzystanek implements IPrezenterPrzystanek {

	private Set<Przystanek> przystanki;
	private Przystanek przystanek;

	public PrezenterPrzystanek() {
		this.przystanki = new HashSet<>();  // Initialize the Set here
	}
	/**
	 * 
	 * @param id
	 */
	public Przystanek getPrzystanek(int id) {
		if (przystanki == null || przystanki.isEmpty()) {
			System.out.println("Zbiór przystanków jest pusty.");
			return null;
		}

		for (Przystanek przystanek : przystanki) {
			if (przystanek.getID() == id) {
				return przystanek;
			}
		}

		System.out.println("Nie znaleziono przystanku o ID " + id + ".");
		return null;
	}

	public Przystanek createPrzystanek(int id, String nazwa, double[] lokalizacja) {
		return new Przystanek(id, nazwa, lokalizacja);
	}

	/**
	 * 
	 * @param id
	 */
	public boolean removePrzystanek(int id) {
		if (przystanki == null || przystanki.isEmpty()) {
			System.out.println("Zbiór przystanków jest pusty.");
			return false;
		}

		boolean removed = przystanki.removeIf(przystanek -> przystanek.getID() == id);

		if (removed) {
			System.out.println("Przystanek o ID " + id + " został usunięty.");
			return true;
		} else {
			System.out.println("Nie znaleziono przystanku o ID " + id + ".");
			return false;
		}

	}

	/**
	 * 
	 * @param przystanek
	 */
	public void addPrzystanek(Przystanek przystanek) {
		if (przystanek == null) {
			throw new IllegalArgumentException("Przystanek nie może być null");
		}

		// Inicjalizacja zbioru, jeśli jest pusty
		if (przystanki == null) {
			przystanki = new HashSet<>();
		}

		// Dodanie przystanku do zbioru
		if (!przystanki.add(przystanek)) {
			System.out.println("Przystanek już istnieje w zbiorze: " + przystanek);
		}
	}

	public Przystanek findPrzystanek(String name) {
		if (przystanki == null || przystanki.isEmpty()) {
			System.out.println("Zbiór przystanków jest pusty.");
			return null;
		}

		for (Przystanek przystanek : przystanki) {
			if (przystanek.getNazwa().equalsIgnoreCase(name)) {
				return przystanek;
			}
		}

		System.out.println("Nie znaleziono przystanku o nazwie \"" + name + "\".");
		return null;
	}



}