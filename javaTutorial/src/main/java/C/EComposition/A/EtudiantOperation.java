package C.EComposition.A;

public class EtudiantOperation {

    public Etudiant etudiant;
     public EtudiantOperation(Etudiant etudiant) {
        this.etudiant = etudiant;
     }

     public void ajouter(){
         System.out.println("etudiant a ajouter "+etudiant.nom);
     }
     public void suprimmer(){
         System.out.println("etudiant a suprimer "+etudiant.no);
     }

     public void information(){
         System.out.println("etudiant nom : "+etudiant.nom);
         System.out.println("etudiant prenom : "+etudiant.prenom);
         System.out.println("etudiant no : "+etudiant.no);
         System.out.println("etudiant nom de pere :"+etudiant.nomDePere);
         System.out.println("etudiant nom de mere :"+etudiant.nomDeMere);
         System.out.println("etdiant date de naissance :"+etudiant.anneDeNaissance);
     }




}
