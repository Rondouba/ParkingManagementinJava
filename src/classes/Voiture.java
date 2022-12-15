
package classes;

/**
 *
 * @author RMR
 */
public class Voiture extends Vehicule{
    private int nombrePortes;
    
    public Voiture(String marques, String modele, String immatriculation, int nombrePortes) {
        super(marques, modele, immatriculation);
        this.nombrePortes=nombrePortes;//initialisation
                
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }
    
}
