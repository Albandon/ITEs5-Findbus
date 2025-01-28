package org.example.Model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class iBiletTest {

    @Test
    @Tag("Get")
    void getZnizkaTest() {
        var Bilet = new BiletNormalny(900,1,3.20f);
        var uBilet = new BiletUlgowy(900,2,3.20f,20);
        assertAll(
                ()->assertEquals(0,Bilet.getZnizka()),
                ()->assertEquals(20,uBilet.getZnizka())
        );
        assertEquals(0,Bilet.getZnizka());

    }
}