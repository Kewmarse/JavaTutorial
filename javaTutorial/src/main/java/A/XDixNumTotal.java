package A;

import java.util.Scanner;

public class XDixNumTotal {
    public static void main(String[] args) {
        int total=0;
    for (int i=1;i<=5;i++){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Entrez votre valeuer :");
        int valeur= scanner.nextInt();

        total+=valeur;
    }
        System.out.println("votre reponse est "+total);


    }
}
