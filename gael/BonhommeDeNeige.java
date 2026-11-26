public class BonhommeDeNeige implements EtreFantastique() {

	public BonhommeDeNeige(String nom, Sexe sexe, int age) {
		super(nom, sexe, age);
	}

	@Override
	public abstract void seComporterCommeUnEtreFantastique();
}