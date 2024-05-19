package A;

import java.util.Scanner;

public class LAge18Control {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Veuillez entrer votre annee de naissance :");

        int naisance= scan.nextInt();

        int age=2024-naisance;

        if(age>18){
            System.out.println("vous aves l'age legal");
        }else {
            System.out.println("vous etes mineur ");
        }

    }
}
