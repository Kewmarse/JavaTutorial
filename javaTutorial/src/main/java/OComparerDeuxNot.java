import java.util.Scanner;

public class OComparerDeuxNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("premier person Entrez votre visa not");
        double visaN1=input.nextDouble();

        System.out.println("premier personne Entrez votre final not");
        double finalN1=input.nextDouble();

        double moyenne1=visaN1*0.4+finalN1*0.6;



        System.out.println("deuxime personne Entrez votre visa not");
        double visaN2=input.nextInt();

        System.out.println("deuxime personne Entrez votre final not");
        double finalN2=input.nextInt();

        double moyenne2=visaN2*0.4+finalN2*0.6;


        if (moyenne1>moyenne2){
            System.out.println("le permier persone est bonne score notu" +moyenne1);
        }else if (moyenne1==moyenne2){
            System.out.println("egalite");
        }else {
            System.out.println("le deuxiemme personne est bonne score notu"+moyenne2);
        }



    }
}
