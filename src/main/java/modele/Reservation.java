package modele;

public class Reservation {
    private Date chdate;
    private PlageHoraire chplageHoraire;
    private String chintitule;

    public Reservation(String parintitule, Date pardate, PlageHoraire parplageHoraire) {
        chintitule = parintitule;
        chdate = pardate;
        chplageHoraire = parplageHoraire;
    }

    public int compareTo(Reservation reservation) {
        if (chdate.compareTo(reservation.chdate) == 1) {
            return 1;
        }
        else if (chdate.compareTo(reservation.chdate) == -1) {
            return -1;
        }
        else if (chdate.compareTo(reservation.chdate) == 0) {
            if (chplageHoraire.compareTo(reservation.chplageHoraire) == 1) {
                return 1;
            }
            else if (chplageHoraire.compareTo(reservation.chplageHoraire) == -1) {
                return -1;
            };
        }
        return 0;
    }

    public String toString() {
        return chintitule + ", " + chdate + ", " + chplageHoraire;
    }
}
