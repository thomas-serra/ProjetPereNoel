public class ElfePostier implements Travailleur() {

	public ElfePostier(String nom, Sexe sexe, int age) {
		super(nom, sexe, age);
	}

	@Override
	public abstract void travailler();
}