package src.personnages.humanoides;
import src.personnages.actions.Travailler;

public final class FeeNoel extends Humanoides implements Travailler {

    @Override
    public void travailler() {
        // Todo
        //augmenter sa magie
        augmenterIndicateurMagie();
    }
}
