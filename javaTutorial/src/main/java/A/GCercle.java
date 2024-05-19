package A;

import java.util.Scanner;

public class GCercle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Entrez votre valeur de cercle");
        int valeur=scanner.nextInt();

        double pi=3.14;

        double result=2*pi*valeur;
        System.out.println(result);
    }
}
