package modele;

import static org.junit.jupiter.api.Assertions.*;

class HoraireTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {System.out.println("setUp");}

    @org.junit.jupiter.api.AfterEach
    void tearDown() {System.out.println("tearDown");}

    @org.junit.jupiter.api.Test
    void toMinutes() {
        System.out.println("toMinutes");
        assertEquals(new Horaire(2,30).toMinutes(),150,"raté 1.1");
        System.out.println("fini 1");
    }

    @org.junit.jupiter.api.Test
    void compareTo() {
        System.out.println("compareTo");
        assertEquals(new Horaire(14,30).compareTo(new Horaire(12,30)),120,"raté 2.1");
        assertEquals(new Horaire(12,30).compareTo(new Horaire(14,30)),-120,"raté 2.2");
        assertEquals(new Horaire(12,30).compareTo(new Horaire(12,30)),0,"raté 2.3");
        System.out.println("fini 2");
    }
}