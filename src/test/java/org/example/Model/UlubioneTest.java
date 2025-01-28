package org.example.Model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UlubioneTest {
    Ulubione fav = new Ulubione();

    @Test
    @Tag("Add")
    void addPrzystanekTest() {
        fav.addPrzystanek(1);
        var arr = fav.getPrzystanki().toArray();
        assertEquals(1,arr[0]);
    }

    @Test
    @Tag("Remove")
    void removePrzystanekTest() {
        fav.addPrzystanek(1);
        assertAll(
            ()-> assertFalse(fav.removePrzystanek(2)),
            ()-> assertTrue(fav.removePrzystanek(1)),
            ()->assertFalse(fav.getPrzystanki().contains(1))
        );
    }

    @Test
    @Tag("Remove")
    void getPrzystankiTest() {
        fav.addPrzystanek(1);
        fav.addPrzystanek(4);
        var arr = fav.getPrzystanki().toArray();
        assertAll(
                ()-> assertEquals(1,arr[0]),
                ()-> assertEquals(4,arr[1])
        );
    }
}