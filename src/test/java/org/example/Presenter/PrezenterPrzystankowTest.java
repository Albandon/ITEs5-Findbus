package org.example.Presenter;

import org.example.Model.Przystanek;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PrezenterPrzystankowTest {
    PrezenterPrzystanek Prezenter = new PrezenterPrzystanek();

    @Test
    void addPrzystanek() {
        int id = 1;
        String nazwa = "Piłsudskiego";
        double[] lokalizacja = {52, 21};
        var przystanek =  Prezenter.createPrzystanek(id, nazwa, lokalizacja);
        Prezenter.addPrzystanek(przystanek);
        Przystanek foundPrzystanek = Prezenter.findPrzystanek(nazwa);
        assertAll (
                assertNotNull(foundPrzystanek, "Przystanek został dodany.");
                assertEquals(przystanek, foundPrzystanek, "Przystanek został znaleziony.");
        );
        assertFalse(Prezenter.removeBilet(1));
    }


    @Test
    void testEquals() {
    }
}