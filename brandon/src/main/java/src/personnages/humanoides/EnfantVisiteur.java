package src.personnages.humanoides;

import src.personnages.actions.SeDivertir;

public class EnfantVisiteur extends Humanoides implements SeDivertir {
    @Override
    public void seDivertir() {
        // Todo
        //augmenter sa magie x 2
        augmenterIndicateurMagie();
    }

    @Override
    public void augmenterIndicateurMagie() {
        super.setIndicateurMagie(getIndicateurMagie()+2);
    }

}

