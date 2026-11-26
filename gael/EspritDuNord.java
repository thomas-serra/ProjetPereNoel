public class EspritDuNord implements EtreFantastique() {

	public EspritDuNord(String nom, Sexe sexe, int age) {
		super(nom, sexe, age);
	}

	@Override
	public abstract void seComporterCommeUnEtreFantastique();
}