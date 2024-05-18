import java.util.Scanner;

public class KConditionGagne {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Entrez votre premier valeur :");
        int valeur=scan.nextInt();

        System.out.println("Entrez votre deuxieme valeur :");
        int valeur2=scan.nextInt();

        int resultat=valeur+valeur2;

        if(resultat>10){
            System.out.println("vous etes gagne");
        }else {
            System.out.println("vous etes perdu");
        }


    }
}
