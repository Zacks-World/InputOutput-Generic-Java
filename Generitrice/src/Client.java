import java.io.Serializable;

public class Client implements Serializable {
    private String Nom;
    private String Prenom;
    private String Email;
    private String Tel;
    private String Adresse;

    public Client(String nom, String prenom, String email, String tel, String adresse) {
        Nom = nom;
        Prenom = prenom;
        Email = email;
        Tel = tel;
        Adresse = adresse;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Adresse='" + Adresse + '\'' +
                '}';
    }
}
