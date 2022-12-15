package classes;

/**
 *
 * @author RMR
 */
public class Moto extends Vehicule{
    private int vitesseMax;
    public Moto(String marques, String modele, String immatriculation, int vitesseMax) {
        super(marques, modele, immatriculation);
        this.vitesseMax=vitesseMax;//initialisation
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
    
}
