package src.personnages;

import src.modules.Nourriture;

public  class Personnage {
    private String nom;
    private char sexe;
    private int age;
    private boolean indicateurFaim;
    private boolean indicateurFatigue;
    private int niveauFaim;
    public static int magieTotale;
    private int indicateurMagie = 100;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public static int getMagieTotale() {
        return magieTotale;
    }

    public static void setMagieTotale(int magieTotale) {
        Personnage.magieTotale = magieTotale;
    }

    public void emettreSon() {

    }
    public void deplacer() {

    }
    public void restaurer() {

    }

    public void activite(boolean activite) {
        if(activite) {

        }
        else {
            //repos
        }
    }

    public int getIndicateurMagie() {
        return indicateurMagie;
    }

    public void augmenterIndicateurMagie() {
        setIndicateurMagie(this.indicateurMagie + 1);
    }

    public void diminuerIndicateurMagie() {
        setIndicateurMagie(this.indicateurMagie - 1);
    }

    public void setIndicateurMagie(int magie) {
        magieTotale -= this.indicateurMagie;
        this.indicateurMagie = magie;
        magieTotale += this.indicateurMagie;
    }


    public void manger(Nourriture aliment) {
        this.niveauFaim = aliment.getValeurNutritive();
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", sexe=" + sexe +
                ", age=" + age +
                ", indicateurFaim=" + indicateurFaim +
                ", indicateurFatigue=" + indicateurFatigue +
                ", niveauFaim=" + niveauFaim +
                ", indicateurMagie=" + indicateurMagie +
                '}';
    }
}
