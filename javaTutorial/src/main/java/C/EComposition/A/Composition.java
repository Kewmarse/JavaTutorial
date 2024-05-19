package C.EComposition.A;

public class Composition {
    public static void main(String[] args) {

        Etudiant etudiant=new Etudiant("akbari","ali",5,"anwar","ayse",1400);


        EtudiantOperation etudiantOperation=new EtudiantOperation(etudiant);

        etudiantOperation.ajouter();


    }
}
