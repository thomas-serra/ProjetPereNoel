public abstract class Personnage() {
	private String nom;
 	private Sexe sexe;
 	private int age;
 	private boolean faim;
 	private boolean fatigue;
 	private int magieDeNoel;

 	public Personnage(String nom, Sexe sexe, int age) {
 		this.nom = nom;
 		this.sexe = sexe;
 		this.age = age;
 		this.faim = false;
 		this.fatigue = false;
 		this.magieDeNoel = 0;
 	}

 	public abstract void emettreUnSon();

 	public abstract void seDeplacer();

 	public void seRestaurer() {
 		this.faim = false;
 	}

 	public void seReposer() {
 		this.fatigue = false;
 	}

 	public void seMettreEnActivite();

 	public void baisserMagieDeNoel(int valeur) {
 		(this.magieDeNoel - valeur < 0 ? this.magieDeNoel = 0 : this.magieDeNoel -= valeur);
 	}

 	public void augmenterMagieDeNoel(int valeur) {
 		this.magieDeNoel += valeur
 	}
}