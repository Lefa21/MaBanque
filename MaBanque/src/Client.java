public class Client {
    private String nom,adresse;

    public Client(String nom,String adresse){
        this.adresse = adresse;
        this.nom = nom;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getNom() {
        return this.nom;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public String toString(){
        return this.nom + " :  " + this.adresse;
    }
}
