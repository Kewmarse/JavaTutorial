package B;

import java.util.Scanner;

public class LTrouveGrandNum {

    public static void grandNum(int num1, int num2) {

        if(num1 > num2) {
            System.out.println("num1 est grand que num2");
        }else {
            System.out.println("num2 est grand que num1");
        }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        grandNum(num1, num2);

       // grandNum(4,9);
    }
}
