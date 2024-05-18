import java.util.Scanner;

public class NMoyenLettre {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Entrez votre not de visa :");
        double visa=scan.nextDouble();

        System.out.println("Entres votre not de final");
        double finalM=scan.nextDouble();

        double moyenne=visa*0.4+finalM*0.6;

        if(moyenne>90){
            System.out.println("AA");
        }
        else if(moyenne>=80){
            System.out.println("BB");
        }
        else {
            System.out.println("Une erreur s'est produit , asseurer vous d'avoir saisi la bonne valeur ");
        }

    }
}
