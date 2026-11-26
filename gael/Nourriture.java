public enum Nourriture {

	BISCUIT(10),
    CHOCOLAT_CHAUD(15),
    GUIMAUVE(5),
    GRUAU_AVOINE(20),
    SUCRE_ORGE(8),
    BONBON(5);

 	private int valeurNutritive;

 	public Nourriture(nom, valeurNutritive) {
 		this.nom = nom;
 		this.valeurNutritive = valeurNutritive;
 	}

 	public int getValeurNutritive() {
 		return this.valeurNutritive;
 	}
}