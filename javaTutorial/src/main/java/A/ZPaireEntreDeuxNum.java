package A;

import java.util.Scanner;

public class ZPaireEntreDeuxNum {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("entrez votre numbre");
     int num1 = scanner.nextInt();

        System.out.println("entrez votre deuxieme number");
     int num2 = scanner.nextInt();

     for (int i = num1; i < num2; i++) {
         if (i % 2 == 0) {
             System.out.println("entre ces deux number est paire"+i);
         }
     }



    }
}
