package client;

import modele.*;

public class ClientHoraire {
    public static void main(String[] args) {
        Horaire temps = new Horaire(10, 0);
        Horaire temps2 = new Horaire(11, 30);
        Date jour = new Date(10, 10 ,2020);
        Horaire temps3 = new Horaire(12, 0);
        Horaire temps4 = new Horaire(13, 30);
        Date jour2 = new Date(10, 10 ,2021);

//
//        System.out.println(temps);
//        System.out.println(temps.getHeure());
//        System.out.println(temps.getQuartHeure());
//        System.out.println(temps.toMinutes());
//        System.out.println(temps);

        PlageHoraire test = new PlageHoraire(temps, temps2);
        PlageHoraire test2 = new PlageHoraire(temps3, temps4);

//        System.out.println(test);
        System.out.println(test.compareTo(test2));

        Reservation pourmoi = new Reservation("Sport", jour, test);
        Reservation pourmoi2 = new Reservation("Repas", jour2, test2);
        System.out.println(pourmoi);
        System.out.println(pourmoi2.compareTo(pourmoi));
    }
}
