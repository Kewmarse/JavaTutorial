package C.LException.A;

import java.util.Scanner;

public class ExceptionKavrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez num1 :");
        int num1 = scanner.nextInt();
        System.out.print("Entrez num2 :");
        int num2 = scanner.nextInt();

        int resultat;

        try {
            resultat=num1/num2;
        }catch (ArithmeticException e){
            System.out.println("Entrez un numero sauf zero :");
            num2=scanner.nextInt();
        }
        resultat=num1/num2;
        System.out.println(resultat);






    }
}
