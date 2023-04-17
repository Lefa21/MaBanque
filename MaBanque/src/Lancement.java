public class Lancement {
    public static void main(String[] args) {
        Client clientBertrand,clientMarie;

        clientBertrand = new Client("Bertrand","Paris");
        clientMarie = new Client("Marie","Normandie");

        System.out.println(clientBertrand.toString());
        System.out.println(clientMarie.toString()+ '\n');

        clientBertrand.setAdresse("Marseille");
        clientMarie.setAdresse("Montreuil");

        System.out.println(clientBertrand.toString());
        System.out.println(clientMarie.toString());

        Compte compteBertrand,compteMarie;

        compteBertrand = new Compte(clientBertrand,01,0.00);
        compteMarie = new Compte(clientMarie,02,10.00);

        System.out.println(compteBertrand.toString());
        System.out.println(compteMarie.toString()+'\n');

        compteBertrand.setSoldeCredit(5.00);
        compteMarie.setSoldeCredit(2000.00);

        System.out.println(compteBertrand.toString());
        System.out.println(compteMarie.toString() + '\n');

        Banque leCréditMontreuillois;


        leCréditMontreuillois = new Banque("leCréditMontreuillois");

        leCréditMontreuillois.ajoutClient(clientBertrand);
        leCréditMontreuillois.ajoutClient(clientMarie);
        leCréditMontreuillois.ajoutCompte(compteBertrand);
        leCréditMontreuillois.ajoutCompte(compteMarie);


        System.out.println("Voici la liste des clients du Crédit Montreuillois :" + leCréditMontreuillois.afficheListeClient());
        System.out.println("Le nombre de clients du Crédit Montreuillois est de : " + leCréditMontreuillois.nombredeCient() + " personnes\n");

        System.out.println("Voici la liste des comptes du Crédit Montreuillois :" + leCréditMontreuillois.afficheListeCompte());
        System.out.println("Le nombre de compte client au sein  du Crédit Montreuillois est de : " + leCréditMontreuillois.nombredeCompte() + " personnes\n");


        leCréditMontreuillois.setcreditéLeSolde(01,2000.00);
        leCréditMontreuillois.setcreditéLeSolde(02,1000.00);

        System.out.println(leCréditMontreuillois.afficheCompte(01));
        System.out.println(leCréditMontreuillois.afficheCompte(02) + '\n');

        leCréditMontreuillois.setAdresseClient("Bertrand","Brest");
        leCréditMontreuillois.setAdresseClient("Marie","Toulouse");

        System.out.println(leCréditMontreuillois.afficheCompte(01));
        System.out.println(leCréditMontreuillois.afficheCompte(02) + '\n');

        leCréditMontreuillois.setcreditéLeSolde(01,-3000.00);
        leCréditMontreuillois.setcreditéLeSolde(02,-6000.00);

        System.out.println(leCréditMontreuillois.afficheCompteADecouvert().toString());
        System.out.println("Voici la liste des comptes du Crédit Montreuillois :" + leCréditMontreuillois.afficheListeCompte());

        Menu menuEmployé;

        menuEmployé = new Menu(leCréditMontreuillois);

        menuEmployé.operations();

    }
}

