package A;

import java.util.Scanner;

public class TPairNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Entrez votre premier valeur ");
        int a=input.nextInt();

        System.out.println("Entrez votre deuxieme valeur ");
        int b=input.nextInt();

        System.out.println("Entrez votre troisieme valeur ");
        int c=input.nextInt();
//        if(a%2==0 || b%2==0 || c%2==0){
        if(a%2==0 && b%2==0 && c%2==0){
            System.out.println("vous etes gagne");
        }else {
            System.out.println("vous etes perdu ");
        }

    }
}
