package org.example.Presenter;

import org.example.Model.BiletNormalny;
import org.example.Model.BiletUlgowy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrezenterBiletTest {
    PrezenterBilet Prezenter = new PrezenterBilet();

    @Test
    void removeBilet() {
        Prezenter.addBilet(Prezenter.createBilet(900,1,3,2));
        assertAll (
                ()->assertTrue(Prezenter.removeBilet(1)),
                ()->assertFalse(Prezenter.removeBilet(2))
        );
        assertFalse(Prezenter.removeBilet(1));
    }

    @Test
    void createBilet() {

        var norm = Prezenter.createBilet(900,1,3.20f,0);
        var ulg = Prezenter.createBilet(900,1,3.20f,20);
        assertAll(
            ()->assertInstanceOf(BiletUlgowy.class, ulg),
            ()->assertInstanceOf(BiletNormalny.class,norm)
        );
        assertNotNull(Prezenter.createBilet(900,1,3.20f,20));
    }
}