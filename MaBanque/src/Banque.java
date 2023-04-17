import java.util.ArrayList;

public class Banque {
    private ArrayList<Client> listeClient;
    private ArrayList<Compte> listeCompte;
    private String nomBanque;

    public Banque(String nomBanque) {
        this.listeClient = new ArrayList<>();
        this.listeCompte = new ArrayList<>();
        this.nomBanque = nomBanque;
    }

    public void ajoutClient(Client client) {
        this.listeClient.add(client);
    }

    public void ajoutCompte(Compte compte) {
        listeCompte.add(compte);
    }

    public String afficheListeClient() {
        return listeClient.toString();
    }

    public String afficheListeCompte() {
        return listeCompte.toString();
    }

    public int nombredeCompte() {
        return listeCompte.size();
    }

    public int nombredeCient() {
        return listeClient.size();
    }

    public String afficheCompte(int numcompte) {

        for (int indice = 0; indice < this.listeCompte.size(); indice++) {
            if (this.listeCompte.get(indice).getNumCompte() == numcompte) {
                return this.listeCompte.get(indice).toString();
            }
        }
        return "Le numéro de compte : " + numcompte + " auquelle vous voulez accèder n'existe pas ";
    }

    public String setcreditéLeSolde(int numcompte, Double creditCompte) {
        for (int indice = 0; indice < this.listeCompte.size(); indice++) {
            if (this.listeCompte.get(indice).getNumCompte() == numcompte) {
                this.listeCompte.get(indice).setSoldeCredit(creditCompte);
                ;
                return "Votre compte à bien était crédité de " + creditCompte + " €, votre solde est maintenant de  " + this.listeCompte.get(indice).getSoldeCredit() + "euros";
            }
        }
        return "Désolé mais nous n'avons pas pu effectuer l'opération, la somme que vous venez d'entrer ou votre numéro de compte est invalide";
    }


    public void setAdresseClient(String nomCLient, String adresse) {
        for (int indice = 0; indice < this.listeClient.size(); indice++) {
            if (this.listeClient.get(indice).getNom().equals(nomCLient)) {
                System.out.println("condition if " + indice);
                this.listeClient.get(indice).setAdresse(adresse);
                System.out.println(listeClient.get(indice));

                //return "Votre adresse à bien était changer, votre nouvelle adresse est la suivante : " + this.listeClient.get(indice).getAdresse();
            }
        }
        //return "Désolé mais nous n'avons pas pu effectuer l'opération,votre nom est introuvable dans notre base de donnée";
    }

    public String afficheCompteADecouvert() {
        ArrayList<Compte> listeCompteADecouvert = new ArrayList<>();
        for (int indice = 0; indice < this.listeCompte.size(); indice++) {
            if (this.listeCompte.get(indice).getSoldeCredit() < 0.00) {
                listeCompteADecouvert.add(this.listeCompte.get(indice));
            }
        }
        return "Voici la liste des client ayant un compte à découvert chez le crédit Montreuillois : " + listeCompteADecouvert;
    }

    public ArrayList<Client> clientExiste(String nomClient) {
        ArrayList<Client> clientExistant = new ArrayList<>();
        for (int indice = 0; indice < this.listeClient.size(); indice++) {
            if (this.listeClient.get(indice).getNom().equals(nomClient)) {
                clientExistant.add(this.listeClient.get(indice));
            }
        }
        return clientExistant;
    }
}