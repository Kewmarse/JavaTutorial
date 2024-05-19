package B;

import java.util.Scanner;

public class AWHILEPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre votre premier valeur :");
        int valeur1 = scanner.nextInt();
        System.out.println("entre votre deuxieme valeur :");
        int valeur2 = scanner.nextInt();

        if (valeur1 > valeur2) {
            System.out.println("valeur1 doit etre petit que valeur2");
        }

        int i=valeur1;
        while ( i<valeur2) {
            if (i%2==0) {
                System.out.println(i);

            }
            i++;

        }


    }





}
