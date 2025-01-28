package org.example.Presenter;

import org.example.Model.BiletNormalny;
import org.example.Model.BiletUlgowy;
import org.example.Model.Przystanek;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PrezenterPrzystankowTest {
    PrezenterPrzystanek Prezenter = new PrezenterPrzystanek();

    @Test
    @Tag("Add")
    void addPrzystanekTest() {
        int id = 1;
        String nazwa = "Piłsudskiego";
        double[] lokalizacja = {52, 21};
        var przystanek =  Prezenter.createPrzystanek(id, nazwa, lokalizacja);
        Prezenter.addPrzystanek(przystanek);
        Przystanek foundPrzystanek = Prezenter.findPrzystanek(nazwa);
        assertAll(
                ()->assertNotNull(foundPrzystanek, "Przystanek został dodany.")
        );
    }

    @Test
    @Tag("Get")
    void getPrzystanekTest() {
        int id = 1;
        String nazwa = "Piłsudskiego";
        double[] lokalizacja = {52, 21};
        var przystanek =  Prezenter.createPrzystanek(id, nazwa, lokalizacja);
        Prezenter.addPrzystanek(przystanek);

        Przystanek foundPrzystanek = Prezenter.getPrzystanek(przystanek.getID());
        assertAll(
                ()->assertEquals(przystanek, foundPrzystanek, "Przystanek został znaleziony.")
        );
    }
    @Test
    @Tag("Get")
    void findPrzystanekTest() {
        int id = 1;
        String nazwa = "Piłsudskiego";
        double[] lokalizacja = {52, 21};
        var przystanek =  Prezenter.createPrzystanek(id, nazwa, lokalizacja);
        Prezenter.addPrzystanek(przystanek);

        Przystanek foundPrzystanek = Prezenter.findPrzystanek(przystanek.getNazwa());
        assertAll(
                ()->assertEquals(przystanek, foundPrzystanek, "Przystanek został znaleziony.")
        );
    }

    @Test
    @Tag("Remove")
    void removePrzystanekTest() {
        String nazwa = "Piłsudskiego";
        double[] lokalizacja = {52, 21};
        var przystanek1 =  Prezenter.createPrzystanek(1, nazwa, lokalizacja);
        Prezenter.addPrzystanek(przystanek1);

        assertAll(
                () -> assertFalse(Prezenter.removePrzystanek(2), "Nie powinno się usunąć nieistniejącego przystanku."),
                () -> assertTrue(Prezenter.removePrzystanek(przystanek1.getID()), "Przystanek A powinien być usunięty."),
                () -> assertNull(Prezenter.getPrzystanek(przystanek1.getID()), "Przystanek A nie powinien znajdować się w zbiorze.")
        );
    }
}