public class Lycanthrope implements EtreFantastique() {

	public Lycanthrope(String nom, Sexe sexe, int age) {
		super(nom, sexe, age);
	}

	@Override
	public abstract void seComporterCommeUnEtreFantastique();
}