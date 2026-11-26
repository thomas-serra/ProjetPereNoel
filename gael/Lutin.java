public class Lutin extends Humanoide implements Diverissable, Travailleur, EtreFantastique() {

	public Lutin(String nom, Sexe sexe, int age) {
		super(nom, sexe, age);
	}

	@Override
	public abstract void seDivertir();

	@Override
	public abstract void travailler();

	@Override
	public abstract void seComporterCommeUnEtreFantastique();
}