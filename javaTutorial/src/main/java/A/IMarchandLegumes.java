package A;

import java.util.Scanner;

public class IMarchandLegumes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("combien de kilos de pommes acheterez vous :");
        int pommesKG=scan.nextInt();
        int prixPommes=2*pommesKG;

        System.out.println("combien de kilo de poire acheterez vous :");
        int poiresKG=scan.nextInt();
        int prixPoires=5*poiresKG;

        System.out.println("combien de kilo d'orange acheterez vous :");
        int orangesKG=scan.nextInt();
        int prixOranges=6*orangesKG;

        System.out.println(prixPommes+prixPoires+prixOranges);


    }
}
