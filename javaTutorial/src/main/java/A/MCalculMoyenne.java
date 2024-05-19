package A;

import java.util.Scanner;

public class MCalculMoyenne {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Entrez votre not de visa :");
        double visaM=input.nextInt();

        System.out.println("Entrez votre not de final :");
        double finalM=input.nextInt();

        double Moyenne=visaM*0.4+finalM*0.6;

        if(Moyenne >50){
            System.out.println("vous avez passe");
        }else{
            System.out.println("vous n'aves pas reussi ");
        }



    }
}
