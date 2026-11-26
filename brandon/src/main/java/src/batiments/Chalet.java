package src.batiments;
import src.personnages.humanoides.Humanoides;

import java.util.Iterator;
import java.util.List;

public class Chalet<TypeHumanoide extends Humanoides> extends Batiment{

    private final Class<TypeHumanoide> dortoirDestinee;

    public Chalet(float superficie, int capaciteAccueil,Class<TypeHumanoide> typeHumanoide) {
        super(superficie, capaciteAccueil);
        this.dortoirDestinee = typeHumanoide;
    }


    public void accueillirPersonnage(TypeHumanoide p) {
        if (dortoirDestinee.isInstance(p)) super.accueillirPersonnage(p);
        else throw new IllegalArgumentException("Ce Personnage essaie d'acceder a un dortoir qui lui est interdit");
    }

    public void reposHumanoide(TypeHumanoide p) {
        List<?> lst = super.getLstPersonnages();
        Iterator<?> it = lst.iterator();
        for (;it.hasNext();) {
            if (it.next().equals(p)) p.activite(false);
        }
    }



}
