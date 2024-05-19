package B;

import java.util.Scanner;

public class BImpairPaire {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int paire=0;
        int impair=0;
        int i=1;
        while(i<4){
            System.out.println("entrez valeur :");
            int number = scanner.nextInt();

            if(i%2==0){
                paire+=i;
            }else {
                impair+=i;
            }
            i++;
        }
        System.out.println("total de paires : "+paire);
        System.out.println("total de impairs : "+impair);

    }
}
