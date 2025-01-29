package org.example;

import org.example.Model.Przystanek;
import org.example.Model.Ulubione;
import org.example.Model.iBilet;
import org.example.Presenter.PrezenterBilet;
import org.example.Presenter.PrezenterPrzystanek;
import org.example.Presenter.PrezenterUlubione;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import mockit.*;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;







@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("Control")
class FunkcjeAplikacjiTest {
    public static FunkcjeAplikacji funkcjeAplikacji;

    @Mocked
    private static Set<iBilet> bazaDanychBilety;
    @Mocked
    private static Set<Przystanek> bazaDanychPrzystanki;

    @BeforeAll
    static void setUp(){
        funkcjeAplikacji = new FunkcjeAplikacji();
        FunkcjeAplikacji.prezenterBiletow = new PrezenterBilet(bazaDanychBilety);
        FunkcjeAplikacji.prezenterUlubione = new PrezenterUlubione();
        FunkcjeAplikacji.prezenterPrzystankow = new PrezenterPrzystanek(bazaDanychPrzystanki);
        FunkcjeAplikacji.prezenterBiletow.addBilet(
                FunkcjeAplikacji.prezenterBiletow.createBilet(900,2,3.20f,0)
        );
    }

    @Tag("Get")
    @Order(1)
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6})
    void getInformacjeBiletuTest(int id) {
        if (id == 2) {
            assertNotEquals("",funkcjeAplikacji.getInformacjeBiletu(id));
        }
        else {
            assertEquals("", funkcjeAplikacji.getInformacjeBiletu(id));
        }
    }

    @ParameterizedTest
    @Tag("Add")
    @Order(2)
    @CsvSource({"3.20 , 20","6.40, 40"})
    void purchaseBiletTest(float cena, int discount) {
        funkcjeAplikacji.purchaseBilet(900,"",cena,discount);
            }
    @Test
    @Order(3)
    void purchaseBiletSizeTest(){
        assertEquals(2,FunkcjeAplikacji.prezenterBiletow.getBilety().length);
    }

    @Test
    @Tag("Add")
    @Order(4)
    void addToUlubioneTest() {

    }

    @ParameterizedTest
    @Order(5)
    @Tag("Remove")
    @ValueSource(ints = {1,2,3,4,5,6})
    void removeFromUlubioneTest(int id) {
        var expected = assertThrows(
                NullPointerException.class,
                () -> funkcjeAplikacji.removeFromUlubione(id)
        );
        System.out.println(expected.getMessage());
    }

}