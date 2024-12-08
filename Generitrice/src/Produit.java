import java.io.Serializable;

public class Produit implements Serializable {
    private String nom;
    private String marque;
    private String Description;
    private float prix;
    private int NbStock;

    public Produit(String nom, String marque, String description, float prix, int nbStock) {
        this.nom = nom;
        this.marque = marque;
        Description = description;
        this.prix = prix;
        NbStock = nbStock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getNbStock() {
        return NbStock;
    }

    public void setNbStock(int nbStock) {
        NbStock = nbStock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", Description='" + Description + '\'' +
                ", prix=" + prix +
                ", NbStock=" + NbStock +
                '}';
    }
}
