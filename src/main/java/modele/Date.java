package modele;

import java.util.Scanner;

public class Date {
    private int chJour ;
    private int chMois ;
    private int chAnnee ;

    public Date(int parJour, int parMois, int parAnnee) {
        chJour = parJour;
        chMois = parMois;
        chAnnee = parAnnee;
    }

    public Date(int parAnnee){
        chAnnee = parAnnee;
        chMois = 1;
        chJour = 1;
    }

    public boolean estValide(){
        if (chAnnee < 1583)
            return false;
        if (chMois < 1 || chMois > 12)
            return false;
        if (chJour < 1 || chJour > dernierJourMois(chMois, chAnnee))
            return false;
        return true;
    }

    public static int dernierJourMois(int parMois, int parAnnee) {
        switch (parMois) {
            case 2: if (estBissextile(parAnnee))
                return 29;
            return 28;
            case 4: case 6: case 8:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean estBissextile(int parAnnee) {
        return parAnnee % 4 == 0 && (parAnnee % 100 != 0 || parAnnee % 400 == 0);
    }

    public static Date lireDate(){
        System.out.println("entrer un jour, mois, année");
        Scanner scanner = new Scanner(System.in);
        int jour = scanner.nextInt();
        int mois = scanner.nextInt();
        int annee = scanner.nextInt();

        return new Date(jour, mois, annee);
    }

    public int compareTo(Date parDate){

//        if (this.chAnnee == parDate.chAnnee && this.chMois == parDate.chMois && this.chJour == parDate.chJour)
//            return 0;

        if (this.chAnnee < parDate.chAnnee)
            return -1;
        if (this.chAnnee > parDate.chAnnee)
            return 1;

        if (this.chMois < parDate.chMois)
            return -1;
        if (this.chMois > parDate.chMois)
            return 1;

        if (this.chJour < parDate.chJour)
            return -1;
        if (this.chJour > parDate.chJour)
            return 1;
        return 0;
    }

    /**
     *  la methode doit retourner la date du lendemain de l'objet appelant (this)
     * @param
     * @return
     */
    public Date datedulendemain() {

        if (this.chJour < dernierJourMois(chMois, chAnnee))
            return new Date(chJour+1, chMois, chAnnee);

        if (chMois < 12)
            return new Date(1, chMois+1, chAnnee);

        return new Date(1, 1, chAnnee+1);

    }

    public String toString() {
        return chJour + "/" + chMois + "/" + chAnnee;
    }
}
