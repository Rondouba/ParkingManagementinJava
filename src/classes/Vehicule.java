
package classes;

/**
 *
 * @author RMR
 */
public abstract class Vehicule {
    protected String marque;
    protected String modele;
    protected String immatriculation;

    public Vehicule(String marques, String modele, String immatriculation) {
        this.marque = marques;
        this.modele = modele;
        this.immatriculation = immatriculation;
    }
    
    

    public String getMarques() {
        return marque;
    }

    public void setMarques(String marques) {
        this.marque = marques;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
    
    
}
