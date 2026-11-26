package src.personnages.humanoides;

import src.personnages.actions.EtreFantastique;
import src.personnages.actions.SeDivertir;
import src.personnages.actions.Travailler;

public final class Lutin extends Humanoides implements SeDivertir, Travailler,EtreFantastique {
    private boolean farceur = false;

    public void seDivertir() {
        // Todo
        //augmenter sa magie
        augmenterIndicateurMagie();
    }

    @Override
    public void travailler() {
        // Todo
        //augmenter sa magie
        augmenterIndicateurMagie();
    }

    @Override
    public void faireDesChosesFantastique() {
        // Todo
        //augmenter sa magie
        augmenterIndicateurMagie();
    }

    public void transformation() {
        this.farceur = !farceur;
    }

    private static enum Farce {
        LAIT_MAGIQUE,SOUPE_AU_BAS,PAPIER_TOILETTE_ROULE,YEUX_REMUANTS,TYROLIENNE
    }

    public void faireUneFarce(Farce farce) {
        if (farceur) {
            System.out.println("Le lutin a effectué la farce suivante : " + farce);
        }
    }

}
