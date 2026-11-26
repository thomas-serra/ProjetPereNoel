package src.batiments;

import src.personnages.Personnage;
import src.personnages.creatures.Creature;
import src.personnages.humanoides.ElfePostier;

public class BureauxPoste extends Batiment{

    public BureauxPoste(float superficie, int capaciteAccueil) {
        super(superficie, capaciteAccueil);
    }


    @Override
    public void accueillirPersonnage(Personnage p) {

        if (p instanceof Creature)
            throw new IllegalArgumentException("Les creatures sont interdits d'acceder au bureau de poste");
        super.accueillirPersonnage(p);
    }

    public void travailler(ElfePostier elfePostier) {
        elfePostier.travailler();
    }
}
