package B;

import java.util.Scanner;

public class DZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultat=0;
        while(true){
            System.out.println("entrez un valeur :");
            int num = sc.nextInt();
            if(num==0){
                break;
            }else {
                resultat+=num;

            }

        }
        System.out.println(resultat);
    }
}
