package src.personnages.creatures;

import src.personnages.actions.EtreFantastique;

public final class BonhommeNeigeVivant extends Creature implements EtreFantastique {
    private int compteur;
    private boolean estFondu = false;

    @Override
    public void faireDesChosesFantastique() {
        // Todo
        //augmenter sa magie
        augmenterIndicateurMagie();
    }

    public void fondre(){
        this.estFondu = true;
    }
}
