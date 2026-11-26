import java.util.ArrayList;

public class Batiment() {
	int superficie;
 	int capaciteAccueil;
 	String degreDeProprete;
 	int nbPersonnagesPresents = 0;
 	ArrayList<Personnage> personnagesPresents = new ArrayList<Personnage>;

 	public Batiment(superficie, capaciteAccueil, degreDeProprete) {
 		this.superficie = superficie;
 		this.capaciteAccueil = capaciteAccueil;
 		this.degreDeProprete = degreDeProprete;
 	}

 	public abstract void afficherCaracteristique();

 	public abstract void accueillirPersonnage(Personnage nouveau);

 	public abstract void entretient();
}