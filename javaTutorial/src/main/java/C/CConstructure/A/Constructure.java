package C.CConstructure.A;

public class Constructure {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant();

        System.out.println(etudiant.getNom());

        etudiant.setNom("anwar");
        System.out.println(etudiant.getNom());
    }
}
