package modele;

public class PlageHoraire {
    private Horaire chdebutHoraire;
    private Horaire chfinHoraire;
    private final static int chDuree_Minimum = 30;

    public PlageHoraire(Horaire pardebutHoraire, Horaire parfinHoraire) {
        chdebutHoraire = pardebutHoraire;
        chfinHoraire = parfinHoraire;

    }

    public int dureeh() {
        return (chfinHoraire.toMinutes() - chdebutHoraire.toMinutes()) / 60;
    }

    public int dureem() {
        return (chfinHoraire.toMinutes() - chdebutHoraire.toMinutes()) % 60;
    }


    public int estValide() {
        if (chfinHoraire.toMinutes() - chdebutHoraire.toMinutes() > chDuree_Minimum) {
            System.out.println("Horaire valide");
            return 1;
        }
        else {
            System.out.println("Horaire non valide");
            return -1;
        }
    }

    public int compareTo(PlageHoraire plageHoraire) {
        if (this.chfinHoraire.toMinutes() <= chdebutHoraire.toMinutes()) {
            return -1;
        }
        else if (this.chfinHoraire.toMinutes() >= chdebutHoraire.toMinutes()) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return chdebutHoraire + " - " + chfinHoraire + ", durée : " + dureeh() + "h" + dureem() + "mn";
    }
}
