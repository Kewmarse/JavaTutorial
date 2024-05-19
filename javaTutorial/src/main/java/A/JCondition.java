package A;

import java.util.Scanner;

public class JCondition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez un valeur :");
        int valeur=scan.nextInt();

        if(valeur>10){
             valeur= valeur/5;
        }
        System.out.println(valeur);    }
}
