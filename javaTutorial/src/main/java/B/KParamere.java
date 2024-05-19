package B;

import java.util.Scanner;

public class KParamere {


    public static void moyenne(int num1, int num2){
        int sum = num1 + num2;

        double avg = sum / 2;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre premier Num :");
        int num1 = sc.nextInt();
        System.out.println("Entrez votre deuxieme Num :");
        int num2 = sc.nextInt();
        moyenne(num1, num2);

        //moyenne(5,5);



    }
}
