package C.DInheritance.COverriding;

public class Overriding {
    public static void main(String[] args) {
        Profersseur profersseur=new Profersseur();
        profersseur.seConnecter("admin","1234");


        Etudiant etudiant=new Etudiant();
        etudiant.seConnecter("admin","1234");



    }
}
