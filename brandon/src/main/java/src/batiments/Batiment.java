package src.batiments;

import src.personnages.Personnage;

import java.util.List;

public class Batiment {
    private float superficie;
    private int capaciteAccueil;
    private double degreProprete = 100.0;
    private Proprete etatProprete = Proprete.BON;
    private int nbPersonnages = 0;
    private List<Personnage> lstPersonnages;
    private static final float NIVEAU_PROPETE_MAX = 100;
    private boolean fermee = true;

    public Batiment(float superficie,int capaciteAccueil) {
        this.superficie = superficie;
        this.capaciteAccueil =  capaciteAccueil;
    }

    public void accueillirPersonnage(Personnage p) {
        if(nbPersonnages < capaciteAccueil & !fermee) {
            lstPersonnages.add(p);
            updateNbPersonnages();
        }
        else throw new IllegalArgumentException("La capacite du batiment est deja atteint");
    }
    public void ouvrir() {
        fermee = true;
    }

    public void fermer() {
        fermee = false;
    }

    public void updateNbPersonnages() {
        this.nbPersonnages = lstPersonnages.size();
    }
    public void updatedegreProprete() {
        if (degreProprete <= 33) {
            etatProprete = Proprete.MAUVAIS;
        } 
        else if (degreProprete <= 66) {
            etatProprete = Proprete.CORRECT; 
        }
        else etatProprete = Proprete.BON;
    }

    public void entretenirBatiment() {
        if (etatProprete == Proprete.BON)
            throw new IllegalArgumentException("Le batiment est deja propre impossible de le maintenir");

        if(degreProprete + 30 > NIVEAU_PROPETE_MAX) {
            degreProprete = NIVEAU_PROPETE_MAX;
        }
        else this.degreProprete = this.degreProprete + 30;
    }

    public  StringBuilder getCaracteristiquesPersonnages() {
        StringBuilder str = new StringBuilder();
        for(Personnage p : lstPersonnages) str.append(p.toString()+'\n');
        return str;
    }

    public String getCaracteristiquePersonnage(Personnage personnage) {

        if(lstPersonnages.contains(personnage)) {
            return personnage.toString();
        }
        else return "Ce personnage ne se trouve pas dans cette maison";
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "superficie=" + superficie +
                ", capaciteAccueil=" + capaciteAccueil +
                ", degreProprete=" + degreProprete +
                ", nbPersonnages=" + nbPersonnages +
                '}';
    }

    public List<Personnage> getLstPersonnages() {
        return this.lstPersonnages;
    }

    private static enum Proprete {
        MAUVAIS,CORRECT,BON
    }
}
