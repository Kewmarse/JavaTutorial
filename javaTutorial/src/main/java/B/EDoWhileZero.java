package B;

import java.util.Scanner;

public class EDoWhileZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultat = 0;
       int num;
       do{
           System.out.println("entrez le num");
           num = scanner.nextInt();
           resultat += num;
       }while(num!=0);
        System.out.println(resultat);
    }

}
