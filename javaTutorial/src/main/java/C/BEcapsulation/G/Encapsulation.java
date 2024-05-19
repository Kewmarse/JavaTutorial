package C.BEcapsulation.G;

import C.BEcapsulation.H.Etudiant;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        C.BEcapsulation.H.Etudiant etudiant = new Etudiant();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre nom");
        String nom = scanner.nextLine();
        System.out.println("Entrez votre prenom");
        String prenom = scanner.nextLine();
        System.out.println("Entrez votre univNo");
        int univNo = scanner.nextInt();
        System.out.println("Entrez votre date Naissance ");
        int dateNaissance = scanner.nextInt();


        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);

        System.out.println(etudiant.getNom());
        System.out.println(etudiant.getPrenom());

        etudiant.setUnivNo(univNo);
        etudiant.setDateNAisance(dateNaissance);



    }
}
