public class FeeDeNoel implements Travailleur, EtreFantastique() {

	public FeeDeNoel(String nom, Sexe sexe, int age) {
		super(nom, sexe, age);
	}

	@Override
	public abstract void travailler();

	@Override
	public abstract void seComporterCommeUnEtreFantastique();
}