package src.batiments;
import src.personnages.Personnage;

import java.text.SimpleDateFormat;
import java.util.Date;
public class TourHorloge extends Batiment{

    public TourHorloge(float superficie) {
        super(superficie, 0);
    }

    public void donnerHeure() {
        SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println(s.format(date));
    }

    public void afficherMagieTotale() {
        System.out.println(Personnage.magieTotale);
    }
}
