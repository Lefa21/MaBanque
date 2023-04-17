public class Compte {
    private int numCompte;
    private double soldeCredit;
    private Client titulaire;

    public Compte(Client titulaire,int numCompte,Double soldeCredit){
        this.titulaire = titulaire;
        this.numCompte = numCompte;
        this.soldeCredit = soldeCredit;
    }

    public Compte(Client titulaire,int numCompte){
        this.titulaire = titulaire;
        this.numCompte = numCompte;
        this.soldeCredit = soldeCredit;
    }


    public void setSoldeCredit(Double soldeCredit){
        this.soldeCredit = this.soldeCredit + soldeCredit;
    }

    public double getSoldeCredit(){
        return this.soldeCredit;
    }

    public int getNumCompte(){
        return this.numCompte;
    }

    public String toString(){
        return this.titulaire.getNom() + " : " + this.titulaire.getAdresse() + ", numéro de compte : " + this.numCompte + " , solde : " + this.soldeCredit + " euros;";

    }

}
