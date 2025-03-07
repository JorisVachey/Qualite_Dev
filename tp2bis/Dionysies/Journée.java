import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Journée {
    Epreuve matin;
    Epreuve apresMidi;
    Epreuve soiree;
    
    public Journée(Epreuve matin, Epreuve après_midi, Epreuve soirée) {
        this.matin = matin;
        this.apresMidi = après_midi;
        this.soiree = soirée;
    }
    
    public Epreuve getMatin() {
        return matin;
    }

    public Epreuve getApresMidi() {
        return apresMidi;
    }

    public Epreuve getSoiree() {
        return soiree;
    }

    /**
     * Calcule puis renvoie le score total d'un auteur sur la journée
     * @param a
     * @return
     */
    public int scoreTotalAuteur(Auteur a){
        int score=0;
        score += getMatin().scoreAuteur(a);
        score += getApresMidi().scoreAuteur(a);
        score += getSoiree().scoreAuteur(a);
        return score;
    }

    /**
     * Calcule  le score total de chacun des auteurs
     */
    public void scoreTotal(Auteur a1, Auteur a2){
        int scoreA1 = this.scoreTotalAuteur(a1);
        int scoreA2 = this.scoreTotalAuteur(a2);
        System.out.println("# Score total");
        System.out.println(a1 + " "+ scoreA1 + " - " + scoreA2 + " " + a2 );
    }

    /**
     * Affiche le gagnant de la journée
     * @return true si le premier joueur remporte la journée
     */
    public boolean gagnant(Auteur a1, Auteur a2){
        //TODO
        return true;
    }
}
