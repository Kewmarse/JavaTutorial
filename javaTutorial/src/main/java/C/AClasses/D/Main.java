package C.AClasses.D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Comptabilite comptabilite = new Comptabilite();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Appuyez sur 1 pour ajouter de l'argent");
        System.out.println("Appuyez sur 2 pour recu de l'argent");
        System.out.println("Appuyez sur 3 pour total de l'argent");
        System.out.print("Votre choix :");

        int valeur=scanner.nextInt();

        if(valeur==1){
            System.out.println("Veuillez écrire l'argent que vous voulez ajouter");
            int argent=scanner.nextInt();
            comptabilite.argentAjouter(argent);
        } else if(valeur==2){
            System.out.println("Veuillez écrire l'argent que vous voulez recu");
            int argent=scanner.nextInt();
            comptabilite.argentAjouter(argent);
        }else{
            comptabilite.argenTotal();
        }









/*
        BaseDeDonne baseDeDonne = new BaseDeDonne();
        baseDeDonne.cree();
        baseDeDonne.mettreAjour();
        baseDeDonne.suprrimer();

        System.out.println("-----------------");
        Comptabilite comptabilite=new Comptabilite();
        System.out.println(comptabilite.nom);
        comptabilite.argentAjouter(50);
        comptabilite.argenRecu(20);
        comptabilite.argenTotal();


*/



    }
}
