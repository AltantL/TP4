package modele;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlageHoraireTest {

    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    void compareTo() {
        System.out.println("compareTo");
        Horaire temps = new Horaire(12,0);
        Horaire temps2 = new Horaire(14,30);
        PlageHoraire test = new PlageHoraire(temps, temps2);
        Horaire temps3 = new Horaire(12,0);
        Horaire temps4 = new Horaire(14,30);
        PlageHoraire test2 = new PlageHoraire(temps3, temps4);
        System.out.println("fini");
    }
}