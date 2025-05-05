package modele;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder( MethodOrderer.OrderAnnotation.class) public class HoraireTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {System.out.println("setUp");}

    @org.junit.jupiter.api.AfterEach
    void tearDown() {System.out.println("tearDown");}

    @org.junit.jupiter.api.Test
    @Order(1)
    void toMinutes() {
        System.out.println("toMinutes");
        assertEquals(new Horaire(2,30).toMinutes(),150,"raté 1.1");
        assertEquals(new Horaire(1,30).toMinutes(),90,"raté 1.2");
        System.out.println("fini 1");
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void compareTo() {
        System.out.println("compareTo");
        System.out.println("partie 1");
        assertEquals(new Horaire(14,30).compareTo(new Horaire(12,30)),120,"raté 2.1");
        assertEquals(new Horaire(12,30).compareTo(new Horaire(14,30)),-120,"raté 2.2");
        assertEquals(new Horaire(12,30).compareTo(new Horaire(12,30)),0,"raté 2.3");
        System.out.println("fini 2");
    }

    @org.junit.jupiter.api.Test
    @Order(3)
    void dureeh() {
        System.out.println("dureeh");
        Horaire temps = new Horaire(12,0);
        Horaire temps2 = new Horaire(14,30);
        PlageHoraire test = new PlageHoraire(temps, temps2);
        assertEquals(test.dureeh(),2,"raté 3.1");
        System.out.println("fini 3");
    }

    @org.junit.jupiter.api.Test
    @Order(4)
    void dureem() {
        System.out.println("dureem");
        Horaire temps = new Horaire(12,0);
        Horaire temps2 = new Horaire(14,30);
        PlageHoraire test = new PlageHoraire(temps, temps2);
        assertEquals(test.dureem(),30,"raté 4.1");
        System.out.println("fini 4");
    }
}