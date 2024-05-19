package A;

import java.util.Scanner;

public class YFactorielle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("entre votre numero :");
        int num = input.nextInt();

        int fac=1;

        for(int i=1;i<=num;i++){

            fac*=i;


        }
        System.out.println(fac);
    }
}
