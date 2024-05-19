package C.DInheritance.AIheritence;

public class Inheritence {
    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant();
        Profersseur profersseur = new Profersseur();

        etudiant.seConnecter("admin","1234");

        profersseur.seConnecter("profersseur","1234");


    }
}
