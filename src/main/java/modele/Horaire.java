package modele;

public class Horaire {
    private int chHeure;
    private int chQuartHeure;

    public Horaire(int parHeure, int parQuartHeure) {
        chHeure = parHeure;
        chQuartHeure = parQuartHeure;
    }

    public int toMinutes() {
        return chHeure*60 + chQuartHeure;
    }

    public int getHeure() {
        return chHeure;
    }

    public int getQuartHeure() {
        return chQuartHeure;
    }

    public void setHeure(int parHeure) {
        chHeure = parHeure;
    }

    public void setQuartHeure(int parQuartHeure) {
        chQuartHeure = parQuartHeure;
    }

    /**
     * compareTo() retourne
     * - un entier négatif si l’horaire this est antérieur à parHoraire
     * - un entier positif si l’horaire this est postérieur à parHoraire
     * - 0 si this et parHoraire sont les mêmes horaires
     * @param parHoraire l’horaire comparé à this
     * @return un entier résultat de la comparaison
     */
    //@Override
    public int compareTo(Horaire parHoraire) {
        return this.toMinutes() - parHoraire.toMinutes();
    }

    public String toString() {
        return chHeure + "h" + chQuartHeure;
    }
}

