package classes;

/**
 *
 * @author RMR
 */
public class Camion extends Vehicule {
    
    private boolean remorque;
    public Camion(String marques, String modele, String immatriculation, boolean remorque) {
        super(marques, modele, immatriculation);
        this.remorque=remorque;//initialisation
    }

    public boolean isRemorque() {
        return remorque;
    }

    public void setRemorque(boolean remorque) {
        this.remorque = remorque;
    }
    
}
