package A;

import java.util.Scanner;

public class QClassNiveuSWITCH {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Entrez votre class :");
        int classNum=input.nextInt();

        switch (classNum)   {
            case 1 :
                System.out.println("Acemi");
                break;
            case 2 :
                    System.out.println("Moyenne");
                    break;

            case 3 :
                System.out.println("Zor");
                break;

            case 4 :
                System.out.println("expert");
                break;

            default:
                System.out.println("Entrez une valeur valide ");


        }
    }
}
