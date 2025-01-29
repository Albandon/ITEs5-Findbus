package org.example;

import org.example.Model.*;
import org.example.Presenter.PrezenterBilet;
import org.example.Presenter.PrezenterPrzystanek;
import org.example.Presenter.PrezenterUlubione;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import static org.example.Model.iBilet.count;

// TODO - Walidacje Danych
public class FunkcjeAplikacji implements IInterakcjaZUzytkownikiem {
	private static Set<iBilet> bazaDanychBilety;
	private static Set<Przystanek> bazaDanychPrzystanki;
	public static PrezenterBilet prezenterBiletow = new PrezenterBilet(bazaDanychBilety);
	public static PrezenterPrzystanek prezenterPrzystankow = new PrezenterPrzystanek(bazaDanychPrzystanki);
	public static PrezenterUlubione prezenterUlubione = new PrezenterUlubione();
	public static boolean TransactionSuccesfull = false;

	public static Ulubione ulubione = new Ulubione();
	@Override
	public Trasa searchTrasa() {
		// TODO - implement FunkcjeAplikacji.searchTrasa
		throw new UnsupportedOperationException();
	}

	@Override
	public String getInformacjeBiletu(int id) {
		var bilet = prezenterBiletow.getBilet(id);

		if (bilet == null) {
			return "";
		}

		return bilet.toString();
	}

	public void printTrasa() {
		// TODO - implement FunkcjeAplikacji.printTrasa
		throw new UnsupportedOperationException();
	}

	public void printBilet() {
		// TODO - implement FunkcjeAplikacji.printBilet
		throw new UnsupportedOperationException();
	}

	public void printPrzystanek() {
		// TODO - implement FunkcjeAplikacji.printPrzystanek
		throw new UnsupportedOperationException();
	}

	public static void startScreen(){
		Scanner scanner = new Scanner(System.in);
		String end_place = "";
		String start_place = "";

		System.out.println("Czy chcesz dodać przystanek do ulubionych:");
		System.out.println("1. TAK");
		System.out.println("2. NIE");
		String choice = scanner.nextLine();
		switch (choice) {
			case "1":
				System.out.println("Wpisz id przystanka, który chcesz dodać do ulubionych:");
				String stop = scanner.nextLine();
				prezenterUlubione.addToUlubione(Integer.parseInt(stop));
				break;
			default:
				break;
		}


		System.out.println("Czy chcesz uzupełnić miejsce startowe z ulubionych:");
		System.out.println("1. TAK");
		System.out.println("2. NIE");
		choice = scanner.nextLine();

		switch (choice) {
			case "1":
				AtomicInteger index = new AtomicInteger();
				System.out.println("Wybierz id przystanku z poniższych:");
				prezenterUlubione.getUlubione().getPrzystanki().iterator().forEachRemaining((id) -> System.out.println((index.getAndIncrement() + 1) + ". " + id));
				choice = scanner.nextLine();
//				start_place = prezenterUlubione.getUlubione().getPrzystanki().iterator().equals();
				break;
			case "2":
				System.out.println("Wprowadz miejsce startowe:");
				start_place = scanner.nextLine();
				break;
			default:
				break;
		}
		System.out.println("Czy chcesz uzupełnić miejsce końcowe z ulubionych:");
		System.out.println("1. TAK");
		System.out.println("2. NIE");
		choice = scanner.nextLine();

		switch (choice) {
			case "1":
				AtomicInteger index = new AtomicInteger();
				System.out.println("Wybierz id przystanku z poniższych:");
				prezenterUlubione.getUlubione().getPrzystanki().iterator().forEachRemaining((id) -> System.out.println((index.getAndIncrement() + 1) + ". " + id));
				choice = scanner.nextLine();
//				end_place = prezenterUlubione.getUlubione().getPrzystanki().iterator().equals();
				break;
			case "2":
				System.out.println("Wprowadz miejsce koncowe:");
				end_place = scanner.nextLine();
				break;
			default:
				break;
		}


		System.out.println("Wprowadz godzine o ktorej chcesz wyruszyc:");
		String time = scanner.nextLine();
		//scanner.close();
		//TODO - Sprawdzić alternatywy lub naprawić
		ArrayList<String> info = new ArrayList<>();

		info.addAll(Arrays.asList(start_place, end_place, time));

		menuPrzejazdow(info);
		return;
	}

	public static void menuPrzejazdow(ArrayList<String> info){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wszystkie przejazdy");
		System.out.println("1. odjazd o: 20:03 | czas 12 minut | przyjazd o 20:15 | autobusy: C");
		System.out.println("2. odjazd o: 20:05 | czas 12 minut | przyjazd o 20:17 | autobusy: C");
		System.out.println("3. odjazd o: 20:07 | czas 12 minut | przyjazd o 20:19 | autobusy: C");
		System.out.println("4. Wróć do ekranu początkowego");

		System.out.println("napisz numer, aby kontynuować:");
		String choice = scanner.nextLine();
		switch (choice) {
			case "1":
				info.addAll(Arrays.asList("20:03", "12", "20:15", "C"));
				opcjePrzjazdu(info);
				break;
			case "2":
				info.addAll(Arrays.asList("20:05", "12", "20:17", "C"));
				opcjePrzjazdu(info);
				break;
			case "3":
				info.addAll(Arrays.asList("20:07", "12", "20:19", "C"));
				opcjePrzjazdu(info);
				break;
			case "4":
				startScreen();
				break;

			default:
				break;
		}
		//scanner.close();	
		return;
	}
	public static void opcjePrzjazdu(ArrayList<String> info){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Zobacz Trasę");
		System.out.println("2. Kup bilet");
		System.out.println("3. wroc");
		System.out.println("Wybierz opcje:");
		String choice = scanner.nextLine();

		switch (choice) {
			case "1":
				zobaczTrase(info);
				break;
			case "2":
				kupBilet(info);
				break;
			case "3":
				startScreen();
				break;
			default:
				break;
		}
		//scanner.close();
	}
	public static void zobaczTrase(ArrayList<String> info){
		Scanner scanner = new Scanner(System.in);
		System.out.println("*mapa z trasą i oznaczonymi przystankami*");
		System.out.println("Lista Przystankow:");
		System.out.println("- Basztowa");
		System.out.println("- Blankowa");
		System.out.println("- Husarska");

		System.out.println("1. Kup bilet");
		System.out.println("2. wroc");
		System.out.println("Wybierz opcje:");
		String choice = scanner.nextLine();
		switch (choice) {
			case "1":
				kupBilet(info);
				break;
			case "2":
				startScreen();
				break;
			default:
				break;
		}
		//scanner.close();

	}
	public static void kupBilet(ArrayList<String> info){
		Scanner scanner = new Scanner(System.in);
		System.out.println("miejsce startowe: " + info.get(0));
		System.out.println("czas: 15 minut");
		System.out.println("miejsce koncowe: " + info.get(2));
		System.out.println("przystanki: " + info.get(6));
		System.out.println("Sposob Transakcji: blik");

		System.out.println("1. Kup bilet normalny");
		System.out.println("2. Kup bilet ulgowy");
		System.out.println("3. wroc");

		System.out.println("Wybierz opcje:");
		String choice = scanner.nextLine();
		switch (choice) {
			case "1":
				kodBlik(4.80f);
				break;
			case "2":
				kodBlik(2.40f);
				break;
			case "3":
				startScreen();
				break;
			default:
				break;
		}
		//scanner.close();
	}

	public static void kodBlik(float cena){
		Scanner scanner = new Scanner(System.in);
		System.out.println("cena: " + cena);
		System.out.println("wpisz kod blik:");
		String kod_blik = scanner.nextLine();
		prezenterBiletow.addBilet(prezenterBiletow.createBilet(15*60, 1, 4.80f, 0));
		System.out.println("udało się zakupić bilet");
		TransactionSuccesfull = true;
		System.out.println("w zakładce bilety możesz go obejrzeć");
		System.out.println("1. bilety");
		System.out.println("2. wroc");
		String choice = scanner.nextLine();
		switch (choice) {
			case "1":
				wyswietlBilety();
				break;
			case "2":
				startScreen();
				break;
			default:
				break;
		}
		//scanner.close();
	}

	public static void wyswietlBilety(){
		Scanner scanner = new Scanner(System.in);
		iBilet[] bilety = prezenterBiletow.getBilety();
		for(int i = 0; i < bilety.length; i++){
			System.out.println("Bilet - pozostały czas:" + bilety[i].getCzas());
		}
		System.out.println("1. wroc");
		String choice = scanner.nextLine();
		if(choice.equals("1")) {
			startScreen();
		}
		//scanner.close();
	}

	public static void main(String[] args){
		int id = 0;
		prezenterPrzystankow.addPrzystanek(new Przystanek(id, "Basztowa",new double[]{12.2, 13.3}));
		id++;
		prezenterPrzystankow.addPrzystanek(new Przystanek(id, "Blankowa",new double[]{12.1, 13.3}));
		id++;
		prezenterPrzystankow.addPrzystanek(new Przystanek(id, "Husarska",new double[]{12.3, 13.3}));
		id++;
		prezenterPrzystankow.addPrzystanek(new Przystanek(id, "Wroclawska",new double[]{12.4, 13.3}));
		id++;
		prezenterPrzystankow.addPrzystanek(new Przystanek(id, "Albanowska",new double[]{12.5, 13.3}));
		startScreen();

	}


	public void printInformacjeTransakcji() {
		// TODO - implement FunkcjeAplikacji.printInformacjeTransakcji
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param czas
	 * @param metodaTransakcji
	 * @param cena
	 */
	@Override
	public void purchaseBilet(int czas, String metodaTransakcji, float cena, int discount) {
		prezenterBiletow.addBilet(prezenterBiletow.createBilet(czas,count.incrementAndGet(),cena,0));
	}

	/**
	 *
	 * @param przystanek
	 */
	@Override
	public void addToUlubione(Przystanek przystanek) {
		prezenterUlubione.addToUlubione(przystanek.getID());
	}

	/**
	 *
	 * @param id
	 */
	@Override
	public void removeFromUlubione(int id) {
		prezenterUlubione.removeFromUlubione(id);
	}

	public int getInformacjePrzystanku(int id) {
		// TODO - implement FunkcjeAplikacji.getInformacjePrzystanku
		throw new UnsupportedOperationException();
	}

}