package src.batiments;

import src.personnages.creatures.Creature;

import java.util.Iterator;
import java.util.List;

public class Enclos<TypeCreature extends Creature> extends Batiment{

    private Class<TypeCreature> enclosDestinee;

    public Enclos(float superficie, int capaciteAccueil,boolean estFermee,Class<TypeCreature> typeCreatureClass) {
        super(superficie, capaciteAccueil);
        this.enclosDestinee = typeCreatureClass;
        if (!estFermee) {
            ouvrir();
        }
    }

    public void accueillirPersonnage(TypeCreature c) {
        if (enclosDestinee.isInstance(c)) super.accueillirPersonnage(c);
        else throw new IllegalArgumentException("Ce Personnage essaie d'acceder  à un enclos qui lui est interdit");
    }

    public void reposHumanoide(TypeCreature c) {
        List<?> lst = super.getLstPersonnages();
        Iterator<?> it = lst.iterator();
        for (;it.hasNext();) {
            if (it.next().equals(c)) c.activite(false);
        }
    }



}
