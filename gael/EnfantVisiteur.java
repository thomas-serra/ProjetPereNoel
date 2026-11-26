public class EnfantVisiteur extends Humanoide implements Diverissable() {

	public EnfantVisiteur(String nom, Sexe sexe, int age) {
		super(nom, sexe, age);
	}

	@Override
	public abstract void seDivertir();

	@Override
 	public void seDeplacer() {
 		seDivertir();
 	}
}