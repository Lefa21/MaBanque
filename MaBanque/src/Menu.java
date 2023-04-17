import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private Banque banque;

    public Menu(Banque banque){
        this.banque = banque;
    }

    public String nouveauClient(){
        System.out.println("Veuillez entrez le nom du client que vous voulez ajouter : ");
        String client = scanner.nextLine();

        return  client;
    }

    public String adresse(){
        System.out.println("Veuillez entrez l'adresse du client que vous voulez ajouter : ");
        String adresseClient = scanner.nextLine();

        return  adresseClient;
    }

    public int numCompte(){
        int numcompte;
        do {
            System.out.println("Veuillez entrer le numéro de compte du client ainsi que la somme à crédité \n");
            System.out.println("entrer le numéro de compte : ");
            numcompte = scanner.nextInt();
        }while (numcompte < 1);
        return numcompte;
    }
    public Client creeClient(){
        Client nouveauCLient = new Client(nouveauClient(),adresse());
        return nouveauCLient;
    }

    public Double sommeCredit(){
        System.out.println("entrez maintenant la somme à crédité sur le compte : ");
        Double sommeACrédité = scanner.nextDouble();
        return sommeACrédité;
    }


    public void operations(){
        int choixConvertie;
        String choixMenu;

        do {
            do {
                System.out.println();
                System.out.println("Bienvuenue cher employé, votre journée peut commencer" + '\n');
                System.out.println("Vous trouverez ici tout les outils nécaissaires afin de faire des opérations sur la banque\n");
                System.out.println("1. Ajout d'un client ");
                System.out.println("2. Crédité le solde d'un compte");
                System.out.println("3. Changer l'adresse d'un client");
                System.out.println("4. affichage de la liste des clients");
                System.out.println("5. Affichage de la liste des comptes");
                System.out.println("6. Affichage du nombre de client ");
                System.out.println("7. Affichage du nombre de compte");
                System.out.println("8. Affichage d'un compte");
                System.out.println("9. Afficher la liste de tout  les comptes à découvert \n");
                System.out.println("saisir le nombre correspondant à votre choix d'opérations : " + "\n");
                choixMenu = scanner.nextLine();
                System.out.println("\n");
            } while (choixMenu.length() != 1);
            choixConvertie = (choixMenu.charAt(0) - 48);
        } while (choixConvertie != 0 && choixConvertie != 2 && choixConvertie != 3 && choixConvertie != 4 && choixConvertie != 5 && choixConvertie != 6 && choixConvertie != 7 && choixConvertie != 8 && choixConvertie != 9 && choixConvertie != 1);

        switch (choixConvertie) {
            case 1:
                this.banque.ajoutClient(creeClient());
                operations();
                break;

            case 2:

                System.out.println(this.banque.setcreditéLeSolde(numCompte(),sommeCredit()));;
                operations();
                break;

            case 3:

                this.banque.setAdresseClient(nouveauClient(),adresse());
                operations();
                break;

            case 4:
                System.out.println(this.banque.afficheListeClient());;
                operations();
                break;

            case 5:
                System.out.println(this.banque.afficheListeCompte());;
                operations();
                break;

            case 6:
                System.out.println("Le nombre de compte actif au sein de la banque est de " + this.banque.nombredeCient());
                operations();
                break;

            case 7:
                System.out.println("Le nombre de compte actif au sein de la banque est de " + this.banque.nombredeCompte());
                operations();
                break;

            case 8:

                System.out.println(this.banque.afficheCompte(numCompte()));;
                operations();
                break;

            case 9:
                System.out.println(this.banque.afficheCompteADecouvert());
                operations();
                break;
        }
    }

}