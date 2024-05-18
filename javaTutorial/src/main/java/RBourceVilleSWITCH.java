import java.util.Scanner;

public class RBourceVilleSWITCH {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Entre votre Ville:");
        String ville =input.nextLine();

        switch (ville){

            case "Paris" :
                System.out.println("le montant de la bourse pour la ville de paris est de 1000 euro");
                break;
            case "Strasbourg" :
                System.out.println("le montant de la bourse pour la ville de strasbourg est 500 euro ");
                break;
            case "Lyon" :
                System.out.println("le montant de la bourse pour la ville de lyon est 300 euro ");
                break;
            case "Toulon" :
                System.out.println("le montant de la bourse pour la ville de toulon est 600 euro");
                break;
            default:
                System.out.println("veuillez saisir un nom de ville correct \nveuillez ecrire correctement les noms de region");

        }

    }
}
